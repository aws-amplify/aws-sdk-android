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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * A specification identifying an individual configuration option along with its
 * current value. For a list of possible namespaces and option values, see <a
 * href=
 * "https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/command-options.html"
 * >Option Values</a> in the <i>AWS Elastic Beanstalk Developer Guide</i>.
 * </p>
 */
public class ConfigurationOptionSetting implements Serializable {
    /**
     * <p>
     * A unique resource name for the option setting. Use it for a time–based
     * scaling configuration option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String resourceName;

    /**
     * <p>
     * A unique namespace that identifies the option's associated AWS resource.
     * </p>
     */
    private String namespace;

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     */
    private String optionName;

    /**
     * <p>
     * The current value for the configuration option.
     * </p>
     */
    private String value;

    /**
     * <p>
     * A unique resource name for the option setting. Use it for a time–based
     * scaling configuration option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         A unique resource name for the option setting. Use it for a
     *         time–based scaling configuration option.
     *         </p>
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * <p>
     * A unique resource name for the option setting. Use it for a time–based
     * scaling configuration option.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceName <p>
     *            A unique resource name for the option setting. Use it for a
     *            time–based scaling configuration option.
     *            </p>
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * A unique resource name for the option setting. Use it for a time–based
     * scaling configuration option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param resourceName <p>
     *            A unique resource name for the option setting. Use it for a
     *            time–based scaling configuration option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationOptionSetting withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * <p>
     * A unique namespace that identifies the option's associated AWS resource.
     * </p>
     *
     * @return <p>
     *         A unique namespace that identifies the option's associated AWS
     *         resource.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * A unique namespace that identifies the option's associated AWS resource.
     * </p>
     *
     * @param namespace <p>
     *            A unique namespace that identifies the option's associated AWS
     *            resource.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * A unique namespace that identifies the option's associated AWS resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param namespace <p>
     *            A unique namespace that identifies the option's associated AWS
     *            resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationOptionSetting withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     *
     * @return <p>
     *         The name of the configuration option.
     *         </p>
     */
    public String getOptionName() {
        return optionName;
    }

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     *
     * @param optionName <p>
     *            The name of the configuration option.
     *            </p>
     */
    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    /**
     * <p>
     * The name of the configuration option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionName <p>
     *            The name of the configuration option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationOptionSetting withOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    /**
     * <p>
     * The current value for the configuration option.
     * </p>
     *
     * @return <p>
     *         The current value for the configuration option.
     *         </p>
     */
    public String getValue() {
        return value;
    }

    /**
     * <p>
     * The current value for the configuration option.
     * </p>
     *
     * @param value <p>
     *            The current value for the configuration option.
     *            </p>
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * <p>
     * The current value for the configuration option.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param value <p>
     *            The current value for the configuration option.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ConfigurationOptionSetting withValue(String value) {
        this.value = value;
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
        if (getResourceName() != null)
            sb.append("ResourceName: " + getResourceName() + ",");
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getOptionName() != null)
            sb.append("OptionName: " + getOptionName() + ",");
        if (getValue() != null)
            sb.append("Value: " + getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime * hashCode + ((getOptionName() == null) ? 0 : getOptionName().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConfigurationOptionSetting == false)
            return false;
        ConfigurationOptionSetting other = (ConfigurationOptionSetting) obj;

        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null
                && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getOptionName() == null ^ this.getOptionName() == null)
            return false;
        if (other.getOptionName() != null
                && other.getOptionName().equals(this.getOptionName()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }
}
