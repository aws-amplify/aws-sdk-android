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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Used to control whether an individual security standard control is enabled or
 * disabled.
 * </p>
 */
public class UpdateStandardsControlRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the security standard control to enable or disable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String standardsControlArn;

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     */
    private String controlStatus;

    /**
     * <p>
     * A description of the reason why you are disabling a security standard
     * control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String disabledReason;

    /**
     * <p>
     * The ARN of the security standard control to enable or disable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ARN of the security standard control to enable or disable.
     *         </p>
     */
    public String getStandardsControlArn() {
        return standardsControlArn;
    }

    /**
     * <p>
     * The ARN of the security standard control to enable or disable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param standardsControlArn <p>
     *            The ARN of the security standard control to enable or disable.
     *            </p>
     */
    public void setStandardsControlArn(String standardsControlArn) {
        this.standardsControlArn = standardsControlArn;
    }

    /**
     * <p>
     * The ARN of the security standard control to enable or disable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param standardsControlArn <p>
     *            The ARN of the security standard control to enable or disable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStandardsControlRequest withStandardsControlArn(String standardsControlArn) {
        this.standardsControlArn = standardsControlArn;
        return this;
    }

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @return <p>
     *         The updated status of the security standard control.
     *         </p>
     * @see ControlStatus
     */
    public String getControlStatus() {
        return controlStatus;
    }

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param controlStatus <p>
     *            The updated status of the security standard control.
     *            </p>
     * @see ControlStatus
     */
    public void setControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
    }

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param controlStatus <p>
     *            The updated status of the security standard control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ControlStatus
     */
    public UpdateStandardsControlRequest withControlStatus(String controlStatus) {
        this.controlStatus = controlStatus;
        return this;
    }

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param controlStatus <p>
     *            The updated status of the security standard control.
     *            </p>
     * @see ControlStatus
     */
    public void setControlStatus(ControlStatus controlStatus) {
        this.controlStatus = controlStatus.toString();
    }

    /**
     * <p>
     * The updated status of the security standard control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ENABLED, DISABLED
     *
     * @param controlStatus <p>
     *            The updated status of the security standard control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ControlStatus
     */
    public UpdateStandardsControlRequest withControlStatus(ControlStatus controlStatus) {
        this.controlStatus = controlStatus.toString();
        return this;
    }

    /**
     * <p>
     * A description of the reason why you are disabling a security standard
     * control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A description of the reason why you are disabling a security
     *         standard control.
     *         </p>
     */
    public String getDisabledReason() {
        return disabledReason;
    }

    /**
     * <p>
     * A description of the reason why you are disabling a security standard
     * control.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param disabledReason <p>
     *            A description of the reason why you are disabling a security
     *            standard control.
     *            </p>
     */
    public void setDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
    }

    /**
     * <p>
     * A description of the reason why you are disabling a security standard
     * control.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param disabledReason <p>
     *            A description of the reason why you are disabling a security
     *            standard control.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStandardsControlRequest withDisabledReason(String disabledReason) {
        this.disabledReason = disabledReason;
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
        if (getStandardsControlArn() != null)
            sb.append("StandardsControlArn: " + getStandardsControlArn() + ",");
        if (getControlStatus() != null)
            sb.append("ControlStatus: " + getControlStatus() + ",");
        if (getDisabledReason() != null)
            sb.append("DisabledReason: " + getDisabledReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStandardsControlArn() == null) ? 0 : getStandardsControlArn().hashCode());
        hashCode = prime * hashCode
                + ((getControlStatus() == null) ? 0 : getControlStatus().hashCode());
        hashCode = prime * hashCode
                + ((getDisabledReason() == null) ? 0 : getDisabledReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStandardsControlRequest == false)
            return false;
        UpdateStandardsControlRequest other = (UpdateStandardsControlRequest) obj;

        if (other.getStandardsControlArn() == null ^ this.getStandardsControlArn() == null)
            return false;
        if (other.getStandardsControlArn() != null
                && other.getStandardsControlArn().equals(this.getStandardsControlArn()) == false)
            return false;
        if (other.getControlStatus() == null ^ this.getControlStatus() == null)
            return false;
        if (other.getControlStatus() != null
                && other.getControlStatus().equals(this.getControlStatus()) == false)
            return false;
        if (other.getDisabledReason() == null ^ this.getDisabledReason() == null)
            return false;
        if (other.getDisabledReason() != null
                && other.getDisabledReason().equals(this.getDisabledReason()) == false)
            return false;
        return true;
    }
}
