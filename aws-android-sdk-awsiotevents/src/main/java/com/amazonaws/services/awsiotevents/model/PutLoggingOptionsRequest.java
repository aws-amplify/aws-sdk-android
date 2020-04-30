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

package com.amazonaws.services.awsiotevents.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Sets or updates the AWS IoT Events logging options.
 * </p>
 * <p>
 * If you update the value of any <code>loggingOptions</code> field, it takes up
 * to one minute for the change to take effect. If you change the policy
 * attached to the role you specified in the <code>roleArn</code> field (for
 * example, to correct an invalid policy), it takes up to five minutes for that
 * change to take effect.
 * </p>
 */
public class PutLoggingOptionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The new values of the AWS IoT Events logging options.
     * </p>
     */
    private LoggingOptions loggingOptions;

    /**
     * <p>
     * The new values of the AWS IoT Events logging options.
     * </p>
     *
     * @return <p>
     *         The new values of the AWS IoT Events logging options.
     *         </p>
     */
    public LoggingOptions getLoggingOptions() {
        return loggingOptions;
    }

    /**
     * <p>
     * The new values of the AWS IoT Events logging options.
     * </p>
     *
     * @param loggingOptions <p>
     *            The new values of the AWS IoT Events logging options.
     *            </p>
     */
    public void setLoggingOptions(LoggingOptions loggingOptions) {
        this.loggingOptions = loggingOptions;
    }

    /**
     * <p>
     * The new values of the AWS IoT Events logging options.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param loggingOptions <p>
     *            The new values of the AWS IoT Events logging options.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLoggingOptionsRequest withLoggingOptions(LoggingOptions loggingOptions) {
        this.loggingOptions = loggingOptions;
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
        if (getLoggingOptions() != null)
            sb.append("loggingOptions: " + getLoggingOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLoggingOptions() == null) ? 0 : getLoggingOptions().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLoggingOptionsRequest == false)
            return false;
        PutLoggingOptionsRequest other = (PutLoggingOptionsRequest) obj;

        if (other.getLoggingOptions() == null ^ this.getLoggingOptions() == null)
            return false;
        if (other.getLoggingOptions() != null
                && other.getLoggingOptions().equals(this.getLoggingOptions()) == false)
            return false;
        return true;
    }
}
