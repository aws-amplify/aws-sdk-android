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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

public class PutLifecycleEventHookExecutionStatusResult implements Serializable {
    /**
     * <p>
     * The execution ID of the lifecycle event hook. A hook is specified in the
     * <code>hooks</code> section of the deployment's AppSpec file.
     * </p>
     */
    private String lifecycleEventHookExecutionId;

    /**
     * <p>
     * The execution ID of the lifecycle event hook. A hook is specified in the
     * <code>hooks</code> section of the deployment's AppSpec file.
     * </p>
     *
     * @return <p>
     *         The execution ID of the lifecycle event hook. A hook is specified
     *         in the <code>hooks</code> section of the deployment's AppSpec
     *         file.
     *         </p>
     */
    public String getLifecycleEventHookExecutionId() {
        return lifecycleEventHookExecutionId;
    }

    /**
     * <p>
     * The execution ID of the lifecycle event hook. A hook is specified in the
     * <code>hooks</code> section of the deployment's AppSpec file.
     * </p>
     *
     * @param lifecycleEventHookExecutionId <p>
     *            The execution ID of the lifecycle event hook. A hook is
     *            specified in the <code>hooks</code> section of the
     *            deployment's AppSpec file.
     *            </p>
     */
    public void setLifecycleEventHookExecutionId(String lifecycleEventHookExecutionId) {
        this.lifecycleEventHookExecutionId = lifecycleEventHookExecutionId;
    }

    /**
     * <p>
     * The execution ID of the lifecycle event hook. A hook is specified in the
     * <code>hooks</code> section of the deployment's AppSpec file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleEventHookExecutionId <p>
     *            The execution ID of the lifecycle event hook. A hook is
     *            specified in the <code>hooks</code> section of the
     *            deployment's AppSpec file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutLifecycleEventHookExecutionStatusResult withLifecycleEventHookExecutionId(
            String lifecycleEventHookExecutionId) {
        this.lifecycleEventHookExecutionId = lifecycleEventHookExecutionId;
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
        if (getLifecycleEventHookExecutionId() != null)
            sb.append("lifecycleEventHookExecutionId: " + getLifecycleEventHookExecutionId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getLifecycleEventHookExecutionId() == null) ? 0
                        : getLifecycleEventHookExecutionId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutLifecycleEventHookExecutionStatusResult == false)
            return false;
        PutLifecycleEventHookExecutionStatusResult other = (PutLifecycleEventHookExecutionStatusResult) obj;

        if (other.getLifecycleEventHookExecutionId() == null
                ^ this.getLifecycleEventHookExecutionId() == null)
            return false;
        if (other.getLifecycleEventHookExecutionId() != null
                && other.getLifecycleEventHookExecutionId().equals(
                        this.getLifecycleEventHookExecutionId()) == false)
            return false;
        return true;
    }
}
