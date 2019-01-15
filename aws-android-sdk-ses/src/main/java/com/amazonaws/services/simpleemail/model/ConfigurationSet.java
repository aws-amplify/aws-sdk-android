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

package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

/**
 * <p>
 * The name of the configuration set.
 * </p>
 * <p>
 * Configuration sets let you create groups of rules that you can apply to the
 * emails you send using Amazon SES. For more information about using
 * configuration sets, see <a href=
 * "http://docs.aws.amazon.com/ses/latest/DeveloperGuide/using-configuration-sets.html"
 * >Using Amazon SES Configuration Sets</a> in the <a
 * href="http://docs.aws.amazon.com/ses/latest/DeveloperGuide/">Amazon SES
 * Developer Guide</a>.
 * </p>
 */
public class ConfigurationSet implements Serializable {
    /**
     * <p>
     * The name of the configuration set. The name must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or
     * dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain 64 characters or fewer.
     * </p>
     * </li>
     * </ul>
     */
    private String name;

    /**
     * <p>
     * The name of the configuration set. The name must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or
     * dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain 64 characters or fewer.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the configuration set. The name must meet the
     *         following requirements:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Contain only letters (a-z, A-Z), numbers (0-9), underscores (_),
     *         or dashes (-).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Contain 64 characters or fewer.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the configuration set. The name must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or
     * dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain 64 characters or fewer.
     * </p>
     * </li>
     * </ul>
     *
     * @param name <p>
     *            The name of the configuration set. The name must meet the
     *            following requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only letters (a-z, A-Z), numbers (0-9), underscores
     *            (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain 64 characters or fewer.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the configuration set. The name must meet the following
     * requirements:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or
     * dashes (-).
     * </p>
     * </li>
     * <li>
     * <p>
     * Contain 64 characters or fewer.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the configuration set. The name must meet the
     *            following requirements:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Contain only letters (a-z, A-Z), numbers (0-9), underscores
     *            (_), or dashes (-).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Contain 64 characters or fewer.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationSet withName(String name) {
        this.name = name;
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
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationSet == false)
            return false;
        ConfigurationSet other = (ConfigurationSet) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
