/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Structure that contains <code>payloadVersion</code> and
 * <code>targetArn</code>.
 * </p>
 */
public class ProvisioningHook implements Serializable {
    /**
     * <p>
     * The payload that was sent to the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 32<br/>
     * <b>Pattern: </b>^[0-9-]+$<br/>
     */
    private String payloadVersion;

    /**
     * <p>
     * The ARN of the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     */
    private String targetArn;

    /**
     * <p>
     * The payload that was sent to the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 32<br/>
     * <b>Pattern: </b>^[0-9-]+$<br/>
     *
     * @return <p>
     *         The payload that was sent to the target function.
     *         </p>
     *         <p>
     *         <i>Note:</i> Only Lambda functions are currently supported.
     *         </p>
     */
    public String getPayloadVersion() {
        return payloadVersion;
    }

    /**
     * <p>
     * The payload that was sent to the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 32<br/>
     * <b>Pattern: </b>^[0-9-]+$<br/>
     *
     * @param payloadVersion <p>
     *            The payload that was sent to the target function.
     *            </p>
     *            <p>
     *            <i>Note:</i> Only Lambda functions are currently supported.
     *            </p>
     */
    public void setPayloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
    }

    /**
     * <p>
     * The payload that was sent to the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>10 - 32<br/>
     * <b>Pattern: </b>^[0-9-]+$<br/>
     *
     * @param payloadVersion <p>
     *            The payload that was sent to the target function.
     *            </p>
     *            <p>
     *            <i>Note:</i> Only Lambda functions are currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningHook withPayloadVersion(String payloadVersion) {
        this.payloadVersion = payloadVersion;
        return this;
    }

    /**
     * <p>
     * The ARN of the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @return <p>
     *         The ARN of the target function.
     *         </p>
     *         <p>
     *         <i>Note:</i> Only Lambda functions are currently supported.
     *         </p>
     */
    public String getTargetArn() {
        return targetArn;
    }

    /**
     * <p>
     * The ARN of the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param targetArn <p>
     *            The ARN of the target function.
     *            </p>
     *            <p>
     *            <i>Note:</i> Only Lambda functions are currently supported.
     *            </p>
     */
    public void setTargetArn(String targetArn) {
        this.targetArn = targetArn;
    }

    /**
     * <p>
     * The ARN of the target function.
     * </p>
     * <p>
     * <i>Note:</i> Only Lambda functions are currently supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     *
     * @param targetArn <p>
     *            The ARN of the target function.
     *            </p>
     *            <p>
     *            <i>Note:</i> Only Lambda functions are currently supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvisioningHook withTargetArn(String targetArn) {
        this.targetArn = targetArn;
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
        if (getPayloadVersion() != null)
            sb.append("payloadVersion: " + getPayloadVersion() + ",");
        if (getTargetArn() != null)
            sb.append("targetArn: " + getTargetArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPayloadVersion() == null) ? 0 : getPayloadVersion().hashCode());
        hashCode = prime * hashCode + ((getTargetArn() == null) ? 0 : getTargetArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvisioningHook == false)
            return false;
        ProvisioningHook other = (ProvisioningHook) obj;

        if (other.getPayloadVersion() == null ^ this.getPayloadVersion() == null)
            return false;
        if (other.getPayloadVersion() != null
                && other.getPayloadVersion().equals(this.getPayloadVersion()) == false)
            return false;
        if (other.getTargetArn() == null ^ this.getTargetArn() == null)
            return false;
        if (other.getTargetArn() != null
                && other.getTargetArn().equals(this.getTargetArn()) == false)
            return false;
        return true;
    }
}
