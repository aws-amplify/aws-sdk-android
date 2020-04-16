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

/**
 * <p>
 * Information about the state of the load balancer.
 * </p>
 */
public class LoadBalancerState implements Serializable {
    /**
     * <p>
     * The state code. The initial state of the load balancer is provisioning.
     * </p>
     * <p>
     * After the load balancer is fully set up and ready to route traffic, its
     * state is active.
     * </p>
     * <p>
     * If the load balancer could not be set up, its state is failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String code;

    /**
     * <p>
     * A description of the state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String reason;

    /**
     * <p>
     * The state code. The initial state of the load balancer is provisioning.
     * </p>
     * <p>
     * After the load balancer is fully set up and ready to route traffic, its
     * state is active.
     * </p>
     * <p>
     * If the load balancer could not be set up, its state is failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The state code. The initial state of the load balancer is
     *         provisioning.
     *         </p>
     *         <p>
     *         After the load balancer is fully set up and ready to route
     *         traffic, its state is active.
     *         </p>
     *         <p>
     *         If the load balancer could not be set up, its state is failed.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The state code. The initial state of the load balancer is provisioning.
     * </p>
     * <p>
     * After the load balancer is fully set up and ready to route traffic, its
     * state is active.
     * </p>
     * <p>
     * If the load balancer could not be set up, its state is failed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param code <p>
     *            The state code. The initial state of the load balancer is
     *            provisioning.
     *            </p>
     *            <p>
     *            After the load balancer is fully set up and ready to route
     *            traffic, its state is active.
     *            </p>
     *            <p>
     *            If the load balancer could not be set up, its state is failed.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The state code. The initial state of the load balancer is provisioning.
     * </p>
     * <p>
     * After the load balancer is fully set up and ready to route traffic, its
     * state is active.
     * </p>
     * <p>
     * If the load balancer could not be set up, its state is failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param code <p>
     *            The state code. The initial state of the load balancer is
     *            provisioning.
     *            </p>
     *            <p>
     *            After the load balancer is fully set up and ready to route
     *            traffic, its state is active.
     *            </p>
     *            <p>
     *            If the load balancer could not be set up, its state is failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerState withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * A description of the state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         A description of the state.
     *         </p>
     */
    public String getReason() {
        return reason;
    }

    /**
     * <p>
     * A description of the state.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param reason <p>
     *            A description of the state.
     *            </p>
     */
    public void setReason(String reason) {
        this.reason = reason;
    }

    /**
     * <p>
     * A description of the state.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param reason <p>
     *            A description of the state.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LoadBalancerState withReason(String reason) {
        this.reason = reason;
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
        if (getCode() != null)
            sb.append("Code: " + getCode() + ",");
        if (getReason() != null)
            sb.append("Reason: " + getReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getReason() == null) ? 0 : getReason().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoadBalancerState == false)
            return false;
        LoadBalancerState other = (LoadBalancerState) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getReason() == null ^ this.getReason() == null)
            return false;
        if (other.getReason() != null && other.getReason().equals(this.getReason()) == false)
            return false;
        return true;
    }
}
