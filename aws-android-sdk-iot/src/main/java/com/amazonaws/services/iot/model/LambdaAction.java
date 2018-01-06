/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes an action to invoke a Lambda function.
 * </p>
 */
public class LambdaAction implements Serializable {
    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     */
    private String functionArn;

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     *
     * @return <p>
     *         The ARN of the Lambda function.
     *         </p>
     */
    public String getFunctionArn() {
        return functionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     *
     * @param functionArn <p>
     *            The ARN of the Lambda function.
     *            </p>
     */
    public void setFunctionArn(String functionArn) {
        this.functionArn = functionArn;
    }

    /**
     * <p>
     * The ARN of the Lambda function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param functionArn <p>
     *            The ARN of the Lambda function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaAction withFunctionArn(String functionArn) {
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
        if (getFunctionArn() != null)
            sb.append("functionArn: " + getFunctionArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

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

        if (obj instanceof LambdaAction == false)
            return false;
        LambdaAction other = (LambdaAction) obj;

        if (other.getFunctionArn() == null ^ this.getFunctionArn() == null)
            return false;
        if (other.getFunctionArn() != null
                && other.getFunctionArn().equals(this.getFunctionArn()) == false)
            return false;
        return true;
    }
}
