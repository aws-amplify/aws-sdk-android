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

package com.amazonaws.services.synthetics.model;

import java.io.Serializable;

/**
 * <p>
 * This structure contains information about the canary's Lambda handler and
 * where its code is stored by CloudWatch Synthetics.
 * </p>
 */
public class CanaryCodeOutput implements Serializable {
    /**
     * <p>
     * The ARN of the Lambda layer where Synthetics stores the canary script
     * code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String sourceLocationArn;

    /**
     * <p>
     * The entry point to use for the source code when running the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String handler;

    /**
     * <p>
     * The ARN of the Lambda layer where Synthetics stores the canary script
     * code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The ARN of the Lambda layer where Synthetics stores the canary
     *         script code.
     *         </p>
     */
    public String getSourceLocationArn() {
        return sourceLocationArn;
    }

    /**
     * <p>
     * The ARN of the Lambda layer where Synthetics stores the canary script
     * code.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param sourceLocationArn <p>
     *            The ARN of the Lambda layer where Synthetics stores the canary
     *            script code.
     *            </p>
     */
    public void setSourceLocationArn(String sourceLocationArn) {
        this.sourceLocationArn = sourceLocationArn;
    }

    /**
     * <p>
     * The ARN of the Lambda layer where Synthetics stores the canary script
     * code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param sourceLocationArn <p>
     *            The ARN of the Lambda layer where Synthetics stores the canary
     *            script code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryCodeOutput withSourceLocationArn(String sourceLocationArn) {
        this.sourceLocationArn = sourceLocationArn;
        return this;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The entry point to use for the source code when running the
     *         canary.
     *         </p>
     */
    public String getHandler() {
        return handler;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param handler <p>
     *            The entry point to use for the source code when running the
     *            canary.
     *            </p>
     */
    public void setHandler(String handler) {
        this.handler = handler;
    }

    /**
     * <p>
     * The entry point to use for the source code when running the canary.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param handler <p>
     *            The entry point to use for the source code when running the
     *            canary.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CanaryCodeOutput withHandler(String handler) {
        this.handler = handler;
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
        if (getSourceLocationArn() != null)
            sb.append("SourceLocationArn: " + getSourceLocationArn() + ",");
        if (getHandler() != null)
            sb.append("Handler: " + getHandler());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSourceLocationArn() == null) ? 0 : getSourceLocationArn().hashCode());
        hashCode = prime * hashCode + ((getHandler() == null) ? 0 : getHandler().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CanaryCodeOutput == false)
            return false;
        CanaryCodeOutput other = (CanaryCodeOutput) obj;

        if (other.getSourceLocationArn() == null ^ this.getSourceLocationArn() == null)
            return false;
        if (other.getSourceLocationArn() != null
                && other.getSourceLocationArn().equals(this.getSourceLocationArn()) == false)
            return false;
        if (other.getHandler() == null ^ this.getHandler() == null)
            return false;
        if (other.getHandler() != null && other.getHandler().equals(this.getHandler()) == false)
            return false;
        return true;
    }
}
