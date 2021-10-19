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

/**
 * <p>
 * Stores metadata about a Lambda processor.
 * </p>
 */
public class LambdaConfiguration implements Serializable {
    /**
     * <p>
     * The ARN of the Lambda message processing function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA
     * -Z0-9\-_\.]+(:(\$LATEST|[a-zA-Z0-9\-_]+))?<br/>
     */
    private String resourceArn;

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASYNC
     */
    private String invocationType;

    /**
     * <p>
     * The ARN of the Lambda message processing function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA
     * -Z0-9\-_\.]+(:(\$LATEST|[a-zA-Z0-9\-_]+))?<br/>
     *
     * @return <p>
     *         The ARN of the Lambda message processing function.
     *         </p>
     */
    public String getResourceArn() {
        return resourceArn;
    }

    /**
     * <p>
     * The ARN of the Lambda message processing function.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA
     * -Z0-9\-_\.]+(:(\$LATEST|[a-zA-Z0-9\-_]+))?<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the Lambda message processing function.
     *            </p>
     */
    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the Lambda message processing function.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>15 - 2048<br/>
     * <b>Pattern:
     * </b>arn:aws:lambda:[a-z]{2}-[a-z]+-\d{1}:\d{12}:function:[a-zA
     * -Z0-9\-_\.]+(:(\$LATEST|[a-zA-Z0-9\-_]+))?<br/>
     *
     * @param resourceArn <p>
     *            The ARN of the Lambda message processing function.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LambdaConfiguration withResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
        return this;
    }

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASYNC
     *
     * @return <p>
     *         Controls how the Lambda function is invoked.
     *         </p>
     * @see InvocationType
     */
    public String getInvocationType() {
        return invocationType;
    }

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASYNC
     *
     * @param invocationType <p>
     *            Controls how the Lambda function is invoked.
     *            </p>
     * @see InvocationType
     */
    public void setInvocationType(String invocationType) {
        this.invocationType = invocationType;
    }

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASYNC
     *
     * @param invocationType <p>
     *            Controls how the Lambda function is invoked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InvocationType
     */
    public LambdaConfiguration withInvocationType(String invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASYNC
     *
     * @param invocationType <p>
     *            Controls how the Lambda function is invoked.
     *            </p>
     * @see InvocationType
     */
    public void setInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
    }

    /**
     * <p>
     * Controls how the Lambda function is invoked.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ASYNC
     *
     * @param invocationType <p>
     *            Controls how the Lambda function is invoked.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InvocationType
     */
    public LambdaConfiguration withInvocationType(InvocationType invocationType) {
        this.invocationType = invocationType.toString();
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: " + getResourceArn() + ",");
        if (getInvocationType() != null)
            sb.append("InvocationType: " + getInvocationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode
                + ((getInvocationType() == null) ? 0 : getInvocationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LambdaConfiguration == false)
            return false;
        LambdaConfiguration other = (LambdaConfiguration) obj;

        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null
                && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getInvocationType() == null ^ this.getInvocationType() == null)
            return false;
        if (other.getInvocationType() != null
                && other.getInvocationType().equals(this.getInvocationType()) == false)
            return false;
        return true;
    }
}
