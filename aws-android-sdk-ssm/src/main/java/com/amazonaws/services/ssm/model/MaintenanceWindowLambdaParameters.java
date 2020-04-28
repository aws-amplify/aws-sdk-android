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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * The parameters for a LAMBDA task type.
 * </p>
 * <p>
 * For information about specifying and updating task parameters, see
 * <a>RegisterTaskWithMaintenanceWindow</a> and
 * <a>UpdateMaintenanceWindowTask</a>.
 * </p>
 * <note>
 * <p>
 * <code>LoggingInfo</code> has been deprecated. To specify an S3 bucket to
 * contain logs, instead use the <code>OutputS3BucketName</code> and
 * <code>OutputS3KeyPrefix</code> options in the
 * <code>TaskInvocationParameters</code> structure. For information about how
 * Systems Manager handles these options for the supported maintenance window
 * task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * <code>TaskParameters</code> has been deprecated. To specify parameters to
 * pass to a task when it runs, instead use the <code>Parameters</code> option
 * in the <code>TaskInvocationParameters</code> structure. For information about
 * how Systems Manager handles these options for the supported maintenance
 * window task types, see <a>MaintenanceWindowTaskInvocationParameters</a>.
 * </p>
 * <p>
 * For Lambda tasks, Systems Manager ignores any values specified for
 * TaskParameters and LoggingInfo.
 * </p>
 * </note>
 */
public class MaintenanceWindowLambdaParameters implements Serializable {
    /**
     * <p>
     * Pass client-specific information to the Lambda function that you are
     * invoking. You can then process the client information in your Lambda
     * function as you choose through the context variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     */
    private String clientContext;

    /**
     * <p>
     * (Optional) Specify a Lambda function version or alias name. If you
     * specify a function version, the action uses the qualified function ARN to
     * invoke a specific Lambda function. If you specify an alias name, the
     * action uses the alias ARN to invoke the Lambda function version to which
     * the alias points.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String qualifier;

    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     */
    private java.nio.ByteBuffer payload;

    /**
     * <p>
     * Pass client-specific information to the Lambda function that you are
     * invoking. You can then process the client information in your Lambda
     * function as you choose through the context variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @return <p>
     *         Pass client-specific information to the Lambda function that you
     *         are invoking. You can then process the client information in your
     *         Lambda function as you choose through the context variable.
     *         </p>
     */
    public String getClientContext() {
        return clientContext;
    }

    /**
     * <p>
     * Pass client-specific information to the Lambda function that you are
     * invoking. You can then process the client information in your Lambda
     * function as you choose through the context variable.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param clientContext <p>
     *            Pass client-specific information to the Lambda function that
     *            you are invoking. You can then process the client information
     *            in your Lambda function as you choose through the context
     *            variable.
     *            </p>
     */
    public void setClientContext(String clientContext) {
        this.clientContext = clientContext;
    }

    /**
     * <p>
     * Pass client-specific information to the Lambda function that you are
     * invoking. You can then process the client information in your Lambda
     * function as you choose through the context variable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 8000<br/>
     *
     * @param clientContext <p>
     *            Pass client-specific information to the Lambda function that
     *            you are invoking. You can then process the client information
     *            in your Lambda function as you choose through the context
     *            variable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowLambdaParameters withClientContext(String clientContext) {
        this.clientContext = clientContext;
        return this;
    }

    /**
     * <p>
     * (Optional) Specify a Lambda function version or alias name. If you
     * specify a function version, the action uses the qualified function ARN to
     * invoke a specific Lambda function. If you specify an alias name, the
     * action uses the alias ARN to invoke the Lambda function version to which
     * the alias points.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         (Optional) Specify a Lambda function version or alias name. If
     *         you specify a function version, the action uses the qualified
     *         function ARN to invoke a specific Lambda function. If you specify
     *         an alias name, the action uses the alias ARN to invoke the Lambda
     *         function version to which the alias points.
     *         </p>
     */
    public String getQualifier() {
        return qualifier;
    }

    /**
     * <p>
     * (Optional) Specify a Lambda function version or alias name. If you
     * specify a function version, the action uses the qualified function ARN to
     * invoke a specific Lambda function. If you specify an alias name, the
     * action uses the alias ARN to invoke the Lambda function version to which
     * the alias points.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param qualifier <p>
     *            (Optional) Specify a Lambda function version or alias name. If
     *            you specify a function version, the action uses the qualified
     *            function ARN to invoke a specific Lambda function. If you
     *            specify an alias name, the action uses the alias ARN to invoke
     *            the Lambda function version to which the alias points.
     *            </p>
     */
    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    /**
     * <p>
     * (Optional) Specify a Lambda function version or alias name. If you
     * specify a function version, the action uses the qualified function ARN to
     * invoke a specific Lambda function. If you specify an alias name, the
     * action uses the alias ARN to invoke the Lambda function version to which
     * the alias points.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param qualifier <p>
     *            (Optional) Specify a Lambda function version or alias name. If
     *            you specify a function version, the action uses the qualified
     *            function ARN to invoke a specific Lambda function. If you
     *            specify an alias name, the action uses the alias ARN to invoke
     *            the Lambda function version to which the alias points.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowLambdaParameters withQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }

    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @return <p>
     *         JSON to provide to your Lambda function as input.
     *         </p>
     */
    public java.nio.ByteBuffer getPayload() {
        return payload;
    }

    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param payload <p>
     *            JSON to provide to your Lambda function as input.
     *            </p>
     */
    public void setPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
    }

    /**
     * <p>
     * JSON to provide to your Lambda function as input.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 4096<br/>
     *
     * @param payload <p>
     *            JSON to provide to your Lambda function as input.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MaintenanceWindowLambdaParameters withPayload(java.nio.ByteBuffer payload) {
        this.payload = payload;
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
        if (getClientContext() != null)
            sb.append("ClientContext: " + getClientContext() + ",");
        if (getQualifier() != null)
            sb.append("Qualifier: " + getQualifier() + ",");
        if (getPayload() != null)
            sb.append("Payload: " + getPayload());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getClientContext() == null) ? 0 : getClientContext().hashCode());
        hashCode = prime * hashCode + ((getQualifier() == null) ? 0 : getQualifier().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceWindowLambdaParameters == false)
            return false;
        MaintenanceWindowLambdaParameters other = (MaintenanceWindowLambdaParameters) obj;

        if (other.getClientContext() == null ^ this.getClientContext() == null)
            return false;
        if (other.getClientContext() != null
                && other.getClientContext().equals(this.getClientContext()) == false)
            return false;
        if (other.getQualifier() == null ^ this.getQualifier() == null)
            return false;
        if (other.getQualifier() != null
                && other.getQualifier().equals(this.getQualifier()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        return true;
    }
}
