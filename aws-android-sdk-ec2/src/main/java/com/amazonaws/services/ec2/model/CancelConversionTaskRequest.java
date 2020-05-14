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
 * Cancels an active conversion task. The task can be the import of an instance
 * or volume. The action removes all artifacts of the conversion, including a
 * partially uploaded volume or instance. If the conversion is complete or is in
 * the process of transferring the final disk image, the command fails and
 * returns an exception.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/AWSEC2/latest/CommandLineReference/ec2-cli-vmimport-export.html"
 * >Importing a Virtual Machine Using the Amazon EC2 CLI</a>.
 * </p>
 */
public class CancelConversionTaskRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     */
    private String conversionTaskId;

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
     * The reason for canceling the conversion task.
     * </p>
     */
    private String reasonMessage;

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     *
     * @return <p>
     *         The ID of the conversion task.
     *         </p>
     */
    public String getConversionTaskId() {
        return conversionTaskId;
    }

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     *
     * @param conversionTaskId <p>
     *            The ID of the conversion task.
     *            </p>
     */
    public void setConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
    }

    /**
     * <p>
     * The ID of the conversion task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param conversionTaskId <p>
     *            The ID of the conversion task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelConversionTaskRequest withConversionTaskId(String conversionTaskId) {
        this.conversionTaskId = conversionTaskId;
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
    public CancelConversionTaskRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The reason for canceling the conversion task.
     * </p>
     *
     * @return <p>
     *         The reason for canceling the conversion task.
     *         </p>
     */
    public String getReasonMessage() {
        return reasonMessage;
    }

    /**
     * <p>
     * The reason for canceling the conversion task.
     * </p>
     *
     * @param reasonMessage <p>
     *            The reason for canceling the conversion task.
     *            </p>
     */
    public void setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
    }

    /**
     * <p>
     * The reason for canceling the conversion task.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param reasonMessage <p>
     *            The reason for canceling the conversion task.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CancelConversionTaskRequest withReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
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
        if (getConversionTaskId() != null)
            sb.append("ConversionTaskId: " + getConversionTaskId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getReasonMessage() != null)
            sb.append("ReasonMessage: " + getReasonMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConversionTaskId() == null) ? 0 : getConversionTaskId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode
                + ((getReasonMessage() == null) ? 0 : getReasonMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CancelConversionTaskRequest == false)
            return false;
        CancelConversionTaskRequest other = (CancelConversionTaskRequest) obj;

        if (other.getConversionTaskId() == null ^ this.getConversionTaskId() == null)
            return false;
        if (other.getConversionTaskId() != null
                && other.getConversionTaskId().equals(this.getConversionTaskId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getReasonMessage() == null ^ this.getReasonMessage() == null)
            return false;
        if (other.getReasonMessage() != null
                && other.getReasonMessage().equals(this.getReasonMessage()) == false)
            return false;
        return true;
    }
}
