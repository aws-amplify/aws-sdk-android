/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the lifecycle hooks for the specified Auto Scaling group.
 * </p>
 */
public class DescribeLifecycleHooksRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String autoScalingGroupName;

    /**
     * <p>
     * The names of one or more lifecycle hooks. If you omit this parameter, all
     * lifecycle hooks are described.
     * </p>
     */
    private java.util.List<String> lifecycleHookNames = new java.util.ArrayList<String>();

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the Auto Scaling group.
     *         </p>
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    /**
     * <p>
     * The name of the Auto Scaling group.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param autoScalingGroupName <p>
     *            The name of the Auto Scaling group.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLifecycleHooksRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * <p>
     * The names of one or more lifecycle hooks. If you omit this parameter, all
     * lifecycle hooks are described.
     * </p>
     *
     * @return <p>
     *         The names of one or more lifecycle hooks. If you omit this
     *         parameter, all lifecycle hooks are described.
     *         </p>
     */
    public java.util.List<String> getLifecycleHookNames() {
        return lifecycleHookNames;
    }

    /**
     * <p>
     * The names of one or more lifecycle hooks. If you omit this parameter, all
     * lifecycle hooks are described.
     * </p>
     *
     * @param lifecycleHookNames <p>
     *            The names of one or more lifecycle hooks. If you omit this
     *            parameter, all lifecycle hooks are described.
     *            </p>
     */
    public void setLifecycleHookNames(java.util.Collection<String> lifecycleHookNames) {
        if (lifecycleHookNames == null) {
            this.lifecycleHookNames = null;
            return;
        }

        this.lifecycleHookNames = new java.util.ArrayList<String>(lifecycleHookNames);
    }

    /**
     * <p>
     * The names of one or more lifecycle hooks. If you omit this parameter, all
     * lifecycle hooks are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleHookNames <p>
     *            The names of one or more lifecycle hooks. If you omit this
     *            parameter, all lifecycle hooks are described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLifecycleHooksRequest withLifecycleHookNames(String... lifecycleHookNames) {
        if (getLifecycleHookNames() == null) {
            this.lifecycleHookNames = new java.util.ArrayList<String>(lifecycleHookNames.length);
        }
        for (String value : lifecycleHookNames) {
            this.lifecycleHookNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more lifecycle hooks. If you omit this parameter, all
     * lifecycle hooks are described.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param lifecycleHookNames <p>
     *            The names of one or more lifecycle hooks. If you omit this
     *            parameter, all lifecycle hooks are described.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeLifecycleHooksRequest withLifecycleHookNames(
            java.util.Collection<String> lifecycleHookNames) {
        setLifecycleHookNames(lifecycleHookNames);
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
        if (getAutoScalingGroupName() != null)
            sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLifecycleHookNames() != null)
            sb.append("LifecycleHookNames: " + getLifecycleHookNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getLifecycleHookNames() == null) ? 0 : getLifecycleHookNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeLifecycleHooksRequest == false)
            return false;
        DescribeLifecycleHooksRequest other = (DescribeLifecycleHooksRequest) obj;

        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null)
            return false;
        if (other.getAutoScalingGroupName() != null
                && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false)
            return false;
        if (other.getLifecycleHookNames() == null ^ this.getLifecycleHookNames() == null)
            return false;
        if (other.getLifecycleHookNames() != null
                && other.getLifecycleHookNames().equals(this.getLifecycleHookNames()) == false)
            return false;
        return true;
    }
}
