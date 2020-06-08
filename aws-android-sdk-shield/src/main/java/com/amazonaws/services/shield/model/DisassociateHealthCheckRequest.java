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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Removes health-based detection from the Shield Advanced protection for a
 * resource. Shield Advanced health-based detection uses the health of your AWS
 * resource to improve responsiveness and accuracy in attack detection and
 * mitigation.
 * </p>
 * <p>
 * You define the health check in Route 53 and then associate or disassociate it
 * with your Shield Advanced protection. For more information, see <a href=
 * "https://docs.aws.amazon.com/waf/latest/developerguide/ddos-overview.html#ddos-advanced-health-check-option"
 * >Shield Advanced Health-Based Detection</a> in the <a
 * href="https://docs.aws.amazon.com/waf/latest/developerguide/">AWS WAF and AWS
 * Shield Developer Guide</a>.
 * </p>
 */
public class DisassociateHealthCheckRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to remove the
     * health check association from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     */
    private String protectionId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the health check that is associated
     * with the protection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:route53:::healthcheck/\S{36}$<br/>
     */
    private String healthCheckArn;

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to remove the
     * health check association from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @return <p>
     *         The unique identifier (ID) for the <a>Protection</a> object to
     *         remove the health check association from.
     *         </p>
     */
    public String getProtectionId() {
        return protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to remove the
     * health check association from.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param protectionId <p>
     *            The unique identifier (ID) for the <a>Protection</a> object to
     *            remove the health check association from.
     *            </p>
     */
    public void setProtectionId(String protectionId) {
        this.protectionId = protectionId;
    }

    /**
     * <p>
     * The unique identifier (ID) for the <a>Protection</a> object to remove the
     * health check association from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 36<br/>
     * <b>Pattern: </b>[a-zA-Z0-9\\-]*<br/>
     *
     * @param protectionId <p>
     *            The unique identifier (ID) for the <a>Protection</a> object to
     *            remove the health check association from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateHealthCheckRequest withProtectionId(String protectionId) {
        this.protectionId = protectionId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the health check that is associated
     * with the protection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:route53:::healthcheck/\S{36}$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the health check that is
     *         associated with the protection.
     *         </p>
     */
    public String getHealthCheckArn() {
        return healthCheckArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the health check that is associated
     * with the protection.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:route53:::healthcheck/\S{36}$<br/>
     *
     * @param healthCheckArn <p>
     *            The Amazon Resource Name (ARN) of the health check that is
     *            associated with the protection.
     *            </p>
     */
    public void setHealthCheckArn(String healthCheckArn) {
        this.healthCheckArn = healthCheckArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the health check that is associated
     * with the protection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:route53:::healthcheck/\S{36}$<br/>
     *
     * @param healthCheckArn <p>
     *            The Amazon Resource Name (ARN) of the health check that is
     *            associated with the protection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateHealthCheckRequest withHealthCheckArn(String healthCheckArn) {
        this.healthCheckArn = healthCheckArn;
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
        if (getProtectionId() != null)
            sb.append("ProtectionId: " + getProtectionId() + ",");
        if (getHealthCheckArn() != null)
            sb.append("HealthCheckArn: " + getHealthCheckArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProtectionId() == null) ? 0 : getProtectionId().hashCode());
        hashCode = prime * hashCode
                + ((getHealthCheckArn() == null) ? 0 : getHealthCheckArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateHealthCheckRequest == false)
            return false;
        DisassociateHealthCheckRequest other = (DisassociateHealthCheckRequest) obj;

        if (other.getProtectionId() == null ^ this.getProtectionId() == null)
            return false;
        if (other.getProtectionId() != null
                && other.getProtectionId().equals(this.getProtectionId()) == false)
            return false;
        if (other.getHealthCheckArn() == null ^ this.getHealthCheckArn() == null)
            return false;
        if (other.getHealthCheckArn() != null
                && other.getHealthCheckArn().equals(this.getHealthCheckArn()) == false)
            return false;
        return true;
    }
}
