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

package com.amazonaws.services.rds.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Applies a pending maintenance action to a resource (for example, to a DB
 * instance).
 * </p>
 */
public class ApplyPendingMaintenanceActionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The RDS Amazon Resource Name (ARN) of the resource that the pending
     * maintenance action applies to. For information about creating an ARN, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     */
    private String resourceIdentifier;

    /**
     * <p>
     * The pending maintenance action to apply to this resource.
     * </p>
     * <p>
     * Valid values: <code>system-update</code>, <code>db-upgrade</code>,
     * <code>hardware-maintenance</code>, <code>ca-certificate-rotation</code>
     * </p>
     */
    private String applyAction;

    /**
     * <p>
     * A value that specifies the type of opt-in request, or undoes an opt-in
     * request. An opt-in request of type <code>immediate</code> can't be
     * undone.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>immediate</code> - Apply the maintenance action immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintenance</code> - Apply the maintenance action during the
     * next maintenance window for the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>undo-opt-in</code> - Cancel any existing
     * <code>next-maintenance</code> opt-in requests.
     * </p>
     * </li>
     * </ul>
     */
    private String optInType;

    /**
     * <p>
     * The RDS Amazon Resource Name (ARN) of the resource that the pending
     * maintenance action applies to. For information about creating an ARN, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     *
     * @return <p>
     *         The RDS Amazon Resource Name (ARN) of the resource that the
     *         pending maintenance action applies to. For information about
     *         creating an ARN, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *         > Constructing an RDS Amazon Resource Name (ARN)</a>.
     *         </p>
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * <p>
     * The RDS Amazon Resource Name (ARN) of the resource that the pending
     * maintenance action applies to. For information about creating an ARN, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     *
     * @param resourceIdentifier <p>
     *            The RDS Amazon Resource Name (ARN) of the resource that the
     *            pending maintenance action applies to. For information about
     *            creating an ARN, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *            > Constructing an RDS Amazon Resource Name (ARN)</a>.
     *            </p>
     */
    public void setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * The RDS Amazon Resource Name (ARN) of the resource that the pending
     * maintenance action applies to. For information about creating an ARN, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     * > Constructing an RDS Amazon Resource Name (ARN)</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifier <p>
     *            The RDS Amazon Resource Name (ARN) of the resource that the
     *            pending maintenance action applies to. For information about
     *            creating an ARN, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.ARN.html#USER_Tagging.ARN.Constructing"
     *            > Constructing an RDS Amazon Resource Name (ARN)</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplyPendingMaintenanceActionRequest withResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * <p>
     * The pending maintenance action to apply to this resource.
     * </p>
     * <p>
     * Valid values: <code>system-update</code>, <code>db-upgrade</code>,
     * <code>hardware-maintenance</code>, <code>ca-certificate-rotation</code>
     * </p>
     *
     * @return <p>
     *         The pending maintenance action to apply to this resource.
     *         </p>
     *         <p>
     *         Valid values: <code>system-update</code>, <code>db-upgrade</code>, <code>hardware-maintenance</code>,
     *         <code>ca-certificate-rotation</code>
     *         </p>
     */
    public String getApplyAction() {
        return applyAction;
    }

    /**
     * <p>
     * The pending maintenance action to apply to this resource.
     * </p>
     * <p>
     * Valid values: <code>system-update</code>, <code>db-upgrade</code>,
     * <code>hardware-maintenance</code>, <code>ca-certificate-rotation</code>
     * </p>
     *
     * @param applyAction <p>
     *            The pending maintenance action to apply to this resource.
     *            </p>
     *            <p>
     *            Valid values: <code>system-update</code>,
     *            <code>db-upgrade</code>, <code>hardware-maintenance</code>,
     *            <code>ca-certificate-rotation</code>
     *            </p>
     */
    public void setApplyAction(String applyAction) {
        this.applyAction = applyAction;
    }

    /**
     * <p>
     * The pending maintenance action to apply to this resource.
     * </p>
     * <p>
     * Valid values: <code>system-update</code>, <code>db-upgrade</code>,
     * <code>hardware-maintenance</code>, <code>ca-certificate-rotation</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyAction <p>
     *            The pending maintenance action to apply to this resource.
     *            </p>
     *            <p>
     *            Valid values: <code>system-update</code>,
     *            <code>db-upgrade</code>, <code>hardware-maintenance</code>,
     *            <code>ca-certificate-rotation</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplyPendingMaintenanceActionRequest withApplyAction(String applyAction) {
        this.applyAction = applyAction;
        return this;
    }

    /**
     * <p>
     * A value that specifies the type of opt-in request, or undoes an opt-in
     * request. An opt-in request of type <code>immediate</code> can't be
     * undone.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>immediate</code> - Apply the maintenance action immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintenance</code> - Apply the maintenance action during the
     * next maintenance window for the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>undo-opt-in</code> - Cancel any existing
     * <code>next-maintenance</code> opt-in requests.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A value that specifies the type of opt-in request, or undoes an
     *         opt-in request. An opt-in request of type <code>immediate</code>
     *         can't be undone.
     *         </p>
     *         <p>
     *         Valid values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>immediate</code> - Apply the maintenance action
     *         immediately.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>next-maintenance</code> - Apply the maintenance action
     *         during the next maintenance window for the resource.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>undo-opt-in</code> - Cancel any existing
     *         <code>next-maintenance</code> opt-in requests.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getOptInType() {
        return optInType;
    }

    /**
     * <p>
     * A value that specifies the type of opt-in request, or undoes an opt-in
     * request. An opt-in request of type <code>immediate</code> can't be
     * undone.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>immediate</code> - Apply the maintenance action immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintenance</code> - Apply the maintenance action during the
     * next maintenance window for the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>undo-opt-in</code> - Cancel any existing
     * <code>next-maintenance</code> opt-in requests.
     * </p>
     * </li>
     * </ul>
     *
     * @param optInType <p>
     *            A value that specifies the type of opt-in request, or undoes
     *            an opt-in request. An opt-in request of type
     *            <code>immediate</code> can't be undone.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>immediate</code> - Apply the maintenance action
     *            immediately.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>next-maintenance</code> - Apply the maintenance action
     *            during the next maintenance window for the resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>undo-opt-in</code> - Cancel any existing
     *            <code>next-maintenance</code> opt-in requests.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setOptInType(String optInType) {
        this.optInType = optInType;
    }

    /**
     * <p>
     * A value that specifies the type of opt-in request, or undoes an opt-in
     * request. An opt-in request of type <code>immediate</code> can't be
     * undone.
     * </p>
     * <p>
     * Valid values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>immediate</code> - Apply the maintenance action immediately.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>next-maintenance</code> - Apply the maintenance action during the
     * next maintenance window for the resource.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>undo-opt-in</code> - Cancel any existing
     * <code>next-maintenance</code> opt-in requests.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optInType <p>
     *            A value that specifies the type of opt-in request, or undoes
     *            an opt-in request. An opt-in request of type
     *            <code>immediate</code> can't be undone.
     *            </p>
     *            <p>
     *            Valid values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>immediate</code> - Apply the maintenance action
     *            immediately.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>next-maintenance</code> - Apply the maintenance action
     *            during the next maintenance window for the resource.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>undo-opt-in</code> - Cancel any existing
     *            <code>next-maintenance</code> opt-in requests.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplyPendingMaintenanceActionRequest withOptInType(String optInType) {
        this.optInType = optInType;
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
        if (getResourceIdentifier() != null)
            sb.append("ResourceIdentifier: " + getResourceIdentifier() + ",");
        if (getApplyAction() != null)
            sb.append("ApplyAction: " + getApplyAction() + ",");
        if (getOptInType() != null)
            sb.append("OptInType: " + getOptInType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getApplyAction() == null) ? 0 : getApplyAction().hashCode());
        hashCode = prime * hashCode + ((getOptInType() == null) ? 0 : getOptInType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplyPendingMaintenanceActionRequest == false)
            return false;
        ApplyPendingMaintenanceActionRequest other = (ApplyPendingMaintenanceActionRequest) obj;

        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null
                && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getApplyAction() == null ^ this.getApplyAction() == null)
            return false;
        if (other.getApplyAction() != null
                && other.getApplyAction().equals(this.getApplyAction()) == false)
            return false;
        if (other.getOptInType() == null ^ this.getOptInType() == null)
            return false;
        if (other.getOptInType() != null
                && other.getOptInType().equals(this.getOptInType()) == false)
            return false;
        return true;
    }
}
