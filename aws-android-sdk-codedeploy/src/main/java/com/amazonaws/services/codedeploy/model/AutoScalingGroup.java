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

/**
 * <p>
 * Information about an Auto Scaling group.
 * </p>
 */
public class AutoScalingGroup implements Serializable {
    /**
     * <p>
     * The Auto Scaling group name.
     * </p>
     */
    private String name;

    /**
     * <p>
     * An Auto Scaling lifecycle event hook name.
     * </p>
     */
    private String hook;

    /**
     * <p>
     * The Auto Scaling group name.
     * </p>
     *
     * @return <p>
     *         The Auto Scaling group name.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The Auto Scaling group name.
     * </p>
     *
     * @param name <p>
     *            The Auto Scaling group name.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The Auto Scaling group name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The Auto Scaling group name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * An Auto Scaling lifecycle event hook name.
     * </p>
     *
     * @return <p>
     *         An Auto Scaling lifecycle event hook name.
     *         </p>
     */
    public String getHook() {
        return hook;
    }

    /**
     * <p>
     * An Auto Scaling lifecycle event hook name.
     * </p>
     *
     * @param hook <p>
     *            An Auto Scaling lifecycle event hook name.
     *            </p>
     */
    public void setHook(String hook) {
        this.hook = hook;
    }

    /**
     * <p>
     * An Auto Scaling lifecycle event hook name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hook <p>
     *            An Auto Scaling lifecycle event hook name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AutoScalingGroup withHook(String hook) {
        this.hook = hook;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getHook() != null)
            sb.append("hook: " + getHook());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getHook() == null) ? 0 : getHook().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoScalingGroup == false)
            return false;
        AutoScalingGroup other = (AutoScalingGroup) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getHook() == null ^ this.getHook() == null)
            return false;
        if (other.getHook() != null && other.getHook().equals(this.getHook()) == false)
            return false;
        return true;
    }
}
