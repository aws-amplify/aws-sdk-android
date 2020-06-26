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

package com.amazonaws.services.api.sagemaker.model;

import java.io.Serializable;

/**
 * <p>
 * Configures the timeout and maximum number of retries for processing a
 * transform job invocation.
 * </p>
 */
public class ModelClientConfig implements Serializable {
    /**
     * <p>
     * The timeout value in seconds for an invocation request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     */
    private Integer invocationsTimeoutInSeconds;

    /**
     * <p>
     * The maximum number of retries when invocation requests are failing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3<br/>
     */
    private Integer invocationsMaxRetries;

    /**
     * <p>
     * The timeout value in seconds for an invocation request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     *
     * @return <p>
     *         The timeout value in seconds for an invocation request.
     *         </p>
     */
    public Integer getInvocationsTimeoutInSeconds() {
        return invocationsTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value in seconds for an invocation request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     *
     * @param invocationsTimeoutInSeconds <p>
     *            The timeout value in seconds for an invocation request.
     *            </p>
     */
    public void setInvocationsTimeoutInSeconds(Integer invocationsTimeoutInSeconds) {
        this.invocationsTimeoutInSeconds = invocationsTimeoutInSeconds;
    }

    /**
     * <p>
     * The timeout value in seconds for an invocation request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 3600<br/>
     *
     * @param invocationsTimeoutInSeconds <p>
     *            The timeout value in seconds for an invocation request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelClientConfig withInvocationsTimeoutInSeconds(Integer invocationsTimeoutInSeconds) {
        this.invocationsTimeoutInSeconds = invocationsTimeoutInSeconds;
        return this;
    }

    /**
     * <p>
     * The maximum number of retries when invocation requests are failing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3<br/>
     *
     * @return <p>
     *         The maximum number of retries when invocation requests are
     *         failing.
     *         </p>
     */
    public Integer getInvocationsMaxRetries() {
        return invocationsMaxRetries;
    }

    /**
     * <p>
     * The maximum number of retries when invocation requests are failing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3<br/>
     *
     * @param invocationsMaxRetries <p>
     *            The maximum number of retries when invocation requests are
     *            failing.
     *            </p>
     */
    public void setInvocationsMaxRetries(Integer invocationsMaxRetries) {
        this.invocationsMaxRetries = invocationsMaxRetries;
    }

    /**
     * <p>
     * The maximum number of retries when invocation requests are failing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 3<br/>
     *
     * @param invocationsMaxRetries <p>
     *            The maximum number of retries when invocation requests are
     *            failing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModelClientConfig withInvocationsMaxRetries(Integer invocationsMaxRetries) {
        this.invocationsMaxRetries = invocationsMaxRetries;
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
        if (getInvocationsTimeoutInSeconds() != null)
            sb.append("InvocationsTimeoutInSeconds: " + getInvocationsTimeoutInSeconds() + ",");
        if (getInvocationsMaxRetries() != null)
            sb.append("InvocationsMaxRetries: " + getInvocationsMaxRetries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getInvocationsTimeoutInSeconds() == null) ? 0
                        : getInvocationsTimeoutInSeconds().hashCode());
        hashCode = prime
                * hashCode
                + ((getInvocationsMaxRetries() == null) ? 0 : getInvocationsMaxRetries().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModelClientConfig == false)
            return false;
        ModelClientConfig other = (ModelClientConfig) obj;

        if (other.getInvocationsTimeoutInSeconds() == null
                ^ this.getInvocationsTimeoutInSeconds() == null)
            return false;
        if (other.getInvocationsTimeoutInSeconds() != null
                && other.getInvocationsTimeoutInSeconds().equals(
                        this.getInvocationsTimeoutInSeconds()) == false)
            return false;
        if (other.getInvocationsMaxRetries() == null ^ this.getInvocationsMaxRetries() == null)
            return false;
        if (other.getInvocationsMaxRetries() != null
                && other.getInvocationsMaxRetries().equals(this.getInvocationsMaxRetries()) == false)
            return false;
        return true;
    }
}
