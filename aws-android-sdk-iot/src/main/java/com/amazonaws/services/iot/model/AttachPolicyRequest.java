/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Attaches a policy to the specified target.
 * </p>
 */
public class AttachPolicyRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the policy to attach.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     */
    private String policyName;

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html"
     * >identity</a> to which the policy is attached.
     * </p>
     */
    private String target;

    /**
     * <p>
     * The name of the policy to attach.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @return <p>
     *         The name of the policy to attach.
     *         </p>
     */
    public String getPolicyName() {
        return policyName;
    }

    /**
     * <p>
     * The name of the policy to attach.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The name of the policy to attach.
     *            </p>
     */
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    /**
     * <p>
     * The name of the policy to attach.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[\w+=,.@-]+<br/>
     *
     * @param policyName <p>
     *            The name of the policy to attach.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachPolicyRequest withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html"
     * >identity</a> to which the policy is attached.
     * </p>
     *
     * @return <p>
     *         The <a href=
     *         "https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html"
     *         >identity</a> to which the policy is attached.
     *         </p>
     */
    public String getTarget() {
        return target;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html"
     * >identity</a> to which the policy is attached.
     * </p>
     *
     * @param target <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html"
     *            >identity</a> to which the policy is attached.
     *            </p>
     */
    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The <a href=
     * "https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html"
     * >identity</a> to which the policy is attached.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param target <p>
     *            The <a href=
     *            "https://docs.aws.amazon.com/iot/latest/developerguide/iot-security-identity.html"
     *            >identity</a> to which the policy is attached.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AttachPolicyRequest withTarget(String target) {
        this.target = target;
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
        if (getPolicyName() != null)
            sb.append("policyName: " + getPolicyName() + ",");
        if (getTarget() != null)
            sb.append("target: " + getTarget());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPolicyName() == null) ? 0 : getPolicyName().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachPolicyRequest == false)
            return false;
        AttachPolicyRequest other = (AttachPolicyRequest) obj;

        if (other.getPolicyName() == null ^ this.getPolicyName() == null)
            return false;
        if (other.getPolicyName() != null
                && other.getPolicyName().equals(this.getPolicyName()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        return true;
    }
}
