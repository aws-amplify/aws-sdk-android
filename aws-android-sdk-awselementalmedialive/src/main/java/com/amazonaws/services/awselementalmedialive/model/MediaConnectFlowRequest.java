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

package com.amazonaws.services.awselementalmedialive.model;

import java.io.Serializable;

/**
 * The settings for a MediaConnect Flow.
 */
public class MediaConnectFlowRequest implements Serializable {
    /**
     * The ARN of the MediaConnect Flow that you want to use as a source.
     */
    private String flowArn;

    /**
     * The ARN of the MediaConnect Flow that you want to use as a source.
     *
     * @return The ARN of the MediaConnect Flow that you want to use as a
     *         source.
     */
    public String getFlowArn() {
        return flowArn;
    }

    /**
     * The ARN of the MediaConnect Flow that you want to use as a source.
     *
     * @param flowArn The ARN of the MediaConnect Flow that you want to use as a
     *            source.
     */
    public void setFlowArn(String flowArn) {
        this.flowArn = flowArn;
    }

    /**
     * The ARN of the MediaConnect Flow that you want to use as a source.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param flowArn The ARN of the MediaConnect Flow that you want to use as a
     *            source.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MediaConnectFlowRequest withFlowArn(String flowArn) {
        this.flowArn = flowArn;
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
        if (getFlowArn() != null)
            sb.append("FlowArn: " + getFlowArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFlowArn() == null) ? 0 : getFlowArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaConnectFlowRequest == false)
            return false;
        MediaConnectFlowRequest other = (MediaConnectFlowRequest) obj;

        if (other.getFlowArn() == null ^ this.getFlowArn() == null)
            return false;
        if (other.getFlowArn() != null && other.getFlowArn().equals(this.getFlowArn()) == false)
            return false;
        return true;
    }
}
