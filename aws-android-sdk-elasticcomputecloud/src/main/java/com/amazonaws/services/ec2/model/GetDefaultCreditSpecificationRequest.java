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
 * Describes the default credit option for CPU usage of a burstable performance
 * instance family.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/burstable-performance-instances.html"
 * >Burstable Performance Instances</a> in the <i>Amazon Elastic Compute Cloud
 * User Guide</i>.
 * </p>
 */
public class GetDefaultCreditSpecificationRequest extends AmazonWebServiceRequest implements
        Serializable {
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
     * The instance family.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     */
    private String instanceFamily;

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
    public GetDefaultCreditSpecificationRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @return <p>
     *         The instance family.
     *         </p>
     * @see UnlimitedSupportedInstanceFamily
     */
    public String getInstanceFamily() {
        return instanceFamily;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @param instanceFamily <p>
     *            The instance family.
     *            </p>
     * @see UnlimitedSupportedInstanceFamily
     */
    public void setInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @param instanceFamily <p>
     *            The instance family.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UnlimitedSupportedInstanceFamily
     */
    public GetDefaultCreditSpecificationRequest withInstanceFamily(String instanceFamily) {
        this.instanceFamily = instanceFamily;
        return this;
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @param instanceFamily <p>
     *            The instance family.
     *            </p>
     * @see UnlimitedSupportedInstanceFamily
     */
    public void setInstanceFamily(UnlimitedSupportedInstanceFamily instanceFamily) {
        this.instanceFamily = instanceFamily.toString();
    }

    /**
     * <p>
     * The instance family.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>t2, t3, t3a
     *
     * @param instanceFamily <p>
     *            The instance family.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see UnlimitedSupportedInstanceFamily
     */
    public GetDefaultCreditSpecificationRequest withInstanceFamily(
            UnlimitedSupportedInstanceFamily instanceFamily) {
        this.instanceFamily = instanceFamily.toString();
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
        if (getInstanceFamily() != null)
            sb.append("InstanceFamily: " + getInstanceFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceFamily() == null) ? 0 : getInstanceFamily().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDefaultCreditSpecificationRequest == false)
            return false;
        GetDefaultCreditSpecificationRequest other = (GetDefaultCreditSpecificationRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getInstanceFamily() == null ^ this.getInstanceFamily() == null)
            return false;
        if (other.getInstanceFamily() != null
                && other.getInstanceFamily().equals(this.getInstanceFamily()) == false)
            return false;
        return true;
    }
}
