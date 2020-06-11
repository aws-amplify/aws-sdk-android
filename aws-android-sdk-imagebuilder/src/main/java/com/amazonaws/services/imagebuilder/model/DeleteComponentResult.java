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

package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;

public class DeleteComponentResult implements Serializable {
    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String requestId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component build version that was
     * deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     */
    private String componentBuildVersionArn;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The request ID that uniquely identifies this request.
     *         </p>
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param requestId <p>
     *            The request ID that uniquely identifies this request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteComponentResult withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component build version that was
     * deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the component build version
     *         that was deleted.
     *         </p>
     */
    public String getComponentBuildVersionArn() {
        return componentBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component build version that was
     * deleted.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     *
     * @param componentBuildVersionArn <p>
     *            The Amazon Resource Name (ARN) of the component build version
     *            that was deleted.
     *            </p>
     */
    public void setComponentBuildVersionArn(String componentBuildVersionArn) {
        this.componentBuildVersionArn = componentBuildVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the component build version that was
     * deleted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):component/
     * [a-z0-9-_]+/\d+\.\d+\.\d+/\d+$<br/>
     *
     * @param componentBuildVersionArn <p>
     *            The Amazon Resource Name (ARN) of the component build version
     *            that was deleted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteComponentResult withComponentBuildVersionArn(String componentBuildVersionArn) {
        this.componentBuildVersionArn = componentBuildVersionArn;
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
        if (getRequestId() != null)
            sb.append("requestId: " + getRequestId() + ",");
        if (getComponentBuildVersionArn() != null)
            sb.append("componentBuildVersionArn: " + getComponentBuildVersionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime
                * hashCode
                + ((getComponentBuildVersionArn() == null) ? 0 : getComponentBuildVersionArn()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteComponentResult == false)
            return false;
        DeleteComponentResult other = (DeleteComponentResult) obj;

        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null
                && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getComponentBuildVersionArn() == null
                ^ this.getComponentBuildVersionArn() == null)
            return false;
        if (other.getComponentBuildVersionArn() != null
                && other.getComponentBuildVersionArn().equals(this.getComponentBuildVersionArn()) == false)
            return false;
        return true;
    }
}
