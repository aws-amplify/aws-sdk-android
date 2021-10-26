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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates channel flow attributes. This is a developer API.
 * </p>
 */
public class UpdateChannelFlowRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the channel flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String channelFlowArn;

    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     */
    private java.util.List<Processor> processors;

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     */
    private String name;

    /**
     * <p>
     * The ARN of the channel flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the channel flow.
     *         </p>
     */
    public String getChannelFlowArn() {
        return channelFlowArn;
    }

    /**
     * <p>
     * The ARN of the channel flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelFlowArn <p>
     *            The ARN of the channel flow.
     *            </p>
     */
    public void setChannelFlowArn(String channelFlowArn) {
        this.channelFlowArn = channelFlowArn;
    }

    /**
     * <p>
     * The ARN of the channel flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param channelFlowArn <p>
     *            The ARN of the channel flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelFlowRequest withChannelFlowArn(String channelFlowArn) {
        this.channelFlowArn = channelFlowArn;
        return this;
    }

    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     *
     * @return <p>
     *         Information about the processor Lambda functions
     *         </p>
     */
    public java.util.List<Processor> getProcessors() {
        return processors;
    }

    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     *
     * @param processors <p>
     *            Information about the processor Lambda functions
     *            </p>
     */
    public void setProcessors(java.util.Collection<Processor> processors) {
        if (processors == null) {
            this.processors = null;
            return;
        }

        this.processors = new java.util.ArrayList<Processor>(processors);
    }

    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processors <p>
     *            Information about the processor Lambda functions
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelFlowRequest withProcessors(Processor... processors) {
        if (getProcessors() == null) {
            this.processors = new java.util.ArrayList<Processor>(processors.length);
        }
        for (Processor value : processors) {
            this.processors.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Information about the processor Lambda functions
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processors <p>
     *            Information about the processor Lambda functions
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelFlowRequest withProcessors(java.util.Collection<Processor> processors) {
        setProcessors(processors);
        return this;
    }

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @return <p>
     *         The name of the channel flow.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param name <p>
     *            The name of the channel flow.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the channel flow.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]*<br/>
     *
     * @param name <p>
     *            The name of the channel flow.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateChannelFlowRequest withName(String name) {
        this.name = name;
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
        if (getChannelFlowArn() != null)
            sb.append("ChannelFlowArn: " + getChannelFlowArn() + ",");
        if (getProcessors() != null)
            sb.append("Processors: " + getProcessors() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getChannelFlowArn() == null) ? 0 : getChannelFlowArn().hashCode());
        hashCode = prime * hashCode + ((getProcessors() == null) ? 0 : getProcessors().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateChannelFlowRequest == false)
            return false;
        UpdateChannelFlowRequest other = (UpdateChannelFlowRequest) obj;

        if (other.getChannelFlowArn() == null ^ this.getChannelFlowArn() == null)
            return false;
        if (other.getChannelFlowArn() != null
                && other.getChannelFlowArn().equals(this.getChannelFlowArn()) == false)
            return false;
        if (other.getProcessors() == null ^ this.getProcessors() == null)
            return false;
        if (other.getProcessors() != null
                && other.getProcessors().equals(this.getProcessors()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
