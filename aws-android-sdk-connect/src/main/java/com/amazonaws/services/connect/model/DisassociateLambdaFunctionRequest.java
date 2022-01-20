/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * Remove the Lambda function from the dropdown options available in the
 * relevant contact flow blocks.
 * </p>
 */
public class DisassociateLambdaFunctionRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance..
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String instanceId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function being
     * disassociated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     */
    private String functionArn;

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance..
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return <p>
     *         The identifier of the Amazon Connect instance. You can find the
     *         instanceId in the ARN of the instance..
     *         </p>
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance..
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance..
     *            </p>
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The identifier of the Amazon Connect instance. You can find the
     * instanceId in the ARN of the instance..
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param instanceId <p>
     *            The identifier of the Amazon Connect instance. You can find
     *            the instanceId in the ARN of the instance..
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateLambdaFunctionRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function being
     * disassociated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the Lambda function being
     *         disassociated.
     *         </p>
     */
    public String getFunctionArn() {
        return functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function being
     * disassociated.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     *
     * @param functionArn <p>
     *            The Amazon Resource Name (ARN) of the Lambda function being
     *            disassociated.
     *            </p>
     */
    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Lambda function being
     * disassociated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 140<br/>
     *
     * @param functionArn <p>
     *            The Amazon Resource Name (ARN) of the Lambda function being
     *            disassociated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DisassociateLambdaFunctionRequest withFunctionArn(String functionArn) {
        this.functionArn = functionArn;
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
        if (getInstanceId() != null)
            sb.append("InstanceId: " + getInstanceId() + ",");
        if (getFunctionArn() != null)
            sb.append("FunctionArn: " + getFunctionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode
                + ((getFunctionArn() == null) ? 0 : getFunctionArn().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DisassociateLambdaFunctionRequest == false)
            return false;
        DisassociateLambdaFunctionRequest other = (DisassociateLambdaFunctionRequest) obj;

        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null
                && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null
                && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        return true;
    }
}
