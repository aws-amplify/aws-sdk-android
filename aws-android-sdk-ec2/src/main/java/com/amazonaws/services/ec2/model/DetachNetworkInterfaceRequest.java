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
 * Detaches a network interface from an instance.
 * </p>
 */
public class DetachNetworkInterfaceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the attachment.
     * </p>
     */
    private String attachmentId;

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
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a
     * network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network
     * interface, you might not be able to attach a different network interface
     * to the same index on the instance without first stopping and starting the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >instance metadata</a> might not get updated. This means that the
     * attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start
     * the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     */
    private Boolean force;

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     *
     * @return <p>
     *         The ID of the attachment.
     *         </p>
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     *
     * @param attachmentId <p>
     *            The ID of the attachment.
     *            </p>
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachmentId <p>
     *            The ID of the attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachNetworkInterfaceRequest withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
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
    public DetachNetworkInterfaceRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a
     * network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network
     * interface, you might not be able to attach a different network interface
     * to the same index on the instance without first stopping and starting the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >instance metadata</a> might not get updated. This means that the
     * attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start
     * the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @return <p>
     *         Specifies whether to force a detachment.
     *         </p>
     *         <note>
     *         <ul>
     *         <li>
     *         <p>
     *         Use the <code>Force</code> parameter only as a last resort to
     *         detach a network interface from a failed instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you use the <code>Force</code> parameter to detach a network
     *         interface, you might not be able to attach a different network
     *         interface to the same index on the instance without first
     *         stopping and starting the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you force the detachment of a network interface, the <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *         >instance metadata</a> might not get updated. This means that the
     *         attributes associated with the detached network interface might
     *         still be visible. The instance metadata will get updated when you
     *         stop and start the instance.
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     */
    public Boolean isForce() {
        return force;
    }

    /**
     * <p>
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a
     * network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network
     * interface, you might not be able to attach a different network interface
     * to the same index on the instance without first stopping and starting the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >instance metadata</a> might not get updated. This means that the
     * attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start
     * the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @return <p>
     *         Specifies whether to force a detachment.
     *         </p>
     *         <note>
     *         <ul>
     *         <li>
     *         <p>
     *         Use the <code>Force</code> parameter only as a last resort to
     *         detach a network interface from a failed instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you use the <code>Force</code> parameter to detach a network
     *         interface, you might not be able to attach a different network
     *         interface to the same index on the instance without first
     *         stopping and starting the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If you force the detachment of a network interface, the <a href=
     *         "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *         >instance metadata</a> might not get updated. This means that the
     *         attributes associated with the detached network interface might
     *         still be visible. The instance metadata will get updated when you
     *         stop and start the instance.
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     */
    public Boolean getForce() {
        return force;
    }

    /**
     * <p>
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a
     * network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network
     * interface, you might not be able to attach a different network interface
     * to the same index on the instance without first stopping and starting the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >instance metadata</a> might not get updated. This means that the
     * attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start
     * the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     *
     * @param force <p>
     *            Specifies whether to force a detachment.
     *            </p>
     *            <note>
     *            <ul>
     *            <li>
     *            <p>
     *            Use the <code>Force</code> parameter only as a last resort to
     *            detach a network interface from a failed instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you use the <code>Force</code> parameter to detach a
     *            network interface, you might not be able to attach a different
     *            network interface to the same index on the instance without
     *            first stopping and starting the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you force the detachment of a network interface, the <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *            >instance metadata</a> might not get updated. This means that
     *            the attributes associated with the detached network interface
     *            might still be visible. The instance metadata will get updated
     *            when you stop and start the instance.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     */
    public void setForce(Boolean force) {
        this.force = force;
    }

    /**
     * <p>
     * Specifies whether to force a detachment.
     * </p>
     * <note>
     * <ul>
     * <li>
     * <p>
     * Use the <code>Force</code> parameter only as a last resort to detach a
     * network interface from a failed instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you use the <code>Force</code> parameter to detach a network
     * interface, you might not be able to attach a different network interface
     * to the same index on the instance without first stopping and starting the
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * If you force the detachment of a network interface, the <a href=
     * "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     * >instance metadata</a> might not get updated. This means that the
     * attributes associated with the detached network interface might still be
     * visible. The instance metadata will get updated when you stop and start
     * the instance.
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param force <p>
     *            Specifies whether to force a detachment.
     *            </p>
     *            <note>
     *            <ul>
     *            <li>
     *            <p>
     *            Use the <code>Force</code> parameter only as a last resort to
     *            detach a network interface from a failed instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you use the <code>Force</code> parameter to detach a
     *            network interface, you might not be able to attach a different
     *            network interface to the same index on the instance without
     *            first stopping and starting the instance.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If you force the detachment of a network interface, the <a
     *            href=
     *            "https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-instance-metadata.html"
     *            >instance metadata</a> might not get updated. This means that
     *            the attributes associated with the detached network interface
     *            might still be visible. The instance metadata will get updated
     *            when you stop and start the instance.
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DetachNetworkInterfaceRequest withForce(Boolean force) {
        this.force = force;
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
        if (getAttachmentId() != null)
            sb.append("AttachmentId: " + getAttachmentId() + ",");
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getForce() != null)
            sb.append("Force: " + getForce());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getForce() == null) ? 0 : getForce().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DetachNetworkInterfaceRequest == false)
            return false;
        DetachNetworkInterfaceRequest other = (DetachNetworkInterfaceRequest) obj;

        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null
                && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getForce() == null ^ this.getForce() == null)
            return false;
        if (other.getForce() != null && other.getForce().equals(this.getForce()) == false)
            return false;
        return true;
    }
}
