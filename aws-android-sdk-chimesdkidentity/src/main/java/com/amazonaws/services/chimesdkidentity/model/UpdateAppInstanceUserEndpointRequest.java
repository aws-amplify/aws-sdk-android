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

package com.amazonaws.services.chimesdkidentity.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the details of an <code>AppInstanceUserEndpoint</code>. You can
 * update the name and <code>AllowMessage</code> values.
 * </p>
 */
public class UpdateAppInstanceUserEndpointRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     */
    private String appInstanceUserArn;

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String endpointId;

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     */
    private String name;

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     */
    private String allowMessages;

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @return <p>
     *         The ARN of the <code>AppInstanceUser</code>.
     *         </p>
     */
    public String getAppInstanceUserArn() {
        return appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>5 - 1600<br/>
     * <b>Pattern:
     * </b>arn:[a-z0-9-\.]{1,63}:[a-z0-9-\.]{0,63}:[a-z0-9-\.]{0,63}:
     * [a-z0-9-\.]{0,63}:[^/].{0,1023}<br/>
     *
     * @param appInstanceUserArn <p>
     *            The ARN of the <code>AppInstanceUser</code>.
     *            </p>
     */
    public void setAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
    }

    /**
     * <p>
     * The ARN of the <code>AppInstanceUser</code>.
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
     * @param appInstanceUserArn <p>
     *            The ARN of the <code>AppInstanceUser</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppInstanceUserEndpointRequest withAppInstanceUserArn(String appInstanceUserArn) {
        this.appInstanceUserArn = appInstanceUserArn;
        return this;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The unique identifier of the <code>AppInstanceUserEndpoint</code>
     *         .
     *         </p>
     */
    public String getEndpointId() {
        return endpointId;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param endpointId <p>
     *            The unique identifier of the
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     */
    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The unique identifier of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param endpointId <p>
     *            The unique identifier of the
     *            <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppInstanceUserEndpointRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @return <p>
     *         The name of the <code>AppInstanceUserEndpoint</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param name <p>
     *            The name of the <code>AppInstanceUserEndpoint</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the <code>AppInstanceUserEndpoint</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1600<br/>
     * <b>Pattern: </b>.*<br/>
     *
     * @param name <p>
     *            The name of the <code>AppInstanceUserEndpoint</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateAppInstanceUserEndpointRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @return <p>
     *         Boolean that controls whether the
     *         <code>AppInstanceUserEndpoint</code> is opted in to receive
     *         messages. <code>ALL</code> indicates the endpoint will receive
     *         all messages. <code>NONE</code> indicates the endpoint will
     *         receive no messages.
     *         </p>
     * @see AllowMessages
     */
    public String getAllowMessages() {
        return allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the
     *            <code>AppInstanceUserEndpoint</code> is opted in to receive
     *            messages. <code>ALL</code> indicates the endpoint will receive
     *            all messages. <code>NONE</code> indicates the endpoint will
     *            receive no messages.
     *            </p>
     * @see AllowMessages
     */
    public void setAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the
     *            <code>AppInstanceUserEndpoint</code> is opted in to receive
     *            messages. <code>ALL</code> indicates the endpoint will receive
     *            all messages. <code>NONE</code> indicates the endpoint will
     *            receive no messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowMessages
     */
    public UpdateAppInstanceUserEndpointRequest withAllowMessages(String allowMessages) {
        this.allowMessages = allowMessages;
        return this;
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the
     *            <code>AppInstanceUserEndpoint</code> is opted in to receive
     *            messages. <code>ALL</code> indicates the endpoint will receive
     *            all messages. <code>NONE</code> indicates the endpoint will
     *            receive no messages.
     *            </p>
     * @see AllowMessages
     */
    public void setAllowMessages(AllowMessages allowMessages) {
        this.allowMessages = allowMessages.toString();
    }

    /**
     * <p>
     * Boolean that controls whether the <code>AppInstanceUserEndpoint</code> is
     * opted in to receive messages. <code>ALL</code> indicates the endpoint
     * will receive all messages. <code>NONE</code> indicates the endpoint will
     * receive no messages.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ALL, NONE
     *
     * @param allowMessages <p>
     *            Boolean that controls whether the
     *            <code>AppInstanceUserEndpoint</code> is opted in to receive
     *            messages. <code>ALL</code> indicates the endpoint will receive
     *            all messages. <code>NONE</code> indicates the endpoint will
     *            receive no messages.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AllowMessages
     */
    public UpdateAppInstanceUserEndpointRequest withAllowMessages(AllowMessages allowMessages) {
        this.allowMessages = allowMessages.toString();
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
        if (getAppInstanceUserArn() != null)
            sb.append("AppInstanceUserArn: " + getAppInstanceUserArn() + ",");
        if (getEndpointId() != null)
            sb.append("EndpointId: " + getEndpointId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getAllowMessages() != null)
            sb.append("AllowMessages: " + getAllowMessages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAppInstanceUserArn() == null) ? 0 : getAppInstanceUserArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getAllowMessages() == null) ? 0 : getAllowMessages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppInstanceUserEndpointRequest == false)
            return false;
        UpdateAppInstanceUserEndpointRequest other = (UpdateAppInstanceUserEndpointRequest) obj;

        if (other.getAppInstanceUserArn() == null ^ this.getAppInstanceUserArn() == null)
            return false;
        if (other.getAppInstanceUserArn() != null
                && other.getAppInstanceUserArn().equals(this.getAppInstanceUserArn()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null
                && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAllowMessages() == null ^ this.getAllowMessages() == null)
            return false;
        if (other.getAllowMessages() != null
                && other.getAllowMessages().equals(this.getAllowMessages()) == false)
            return false;
        return true;
    }
}
