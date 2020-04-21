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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * The list of supported product configurations which allow user-supplied
 * arguments. EMR accepts these arguments and forwards them to the corresponding
 * installation script as bootstrap action arguments.
 * </p>
 */
public class SupportedProductConfig implements Serializable {
    /**
     * <p>
     * The name of the product configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     */
    private String name;

    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     */
    private java.util.List<String> args;

    /**
     * <p>
     * The name of the product configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @return <p>
     *         The name of the product configuration.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the product configuration.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param name <p>
     *            The name of the product configuration.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the product configuration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     * <b>Pattern: </b>[ -\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*
     * <br/>
     *
     * @param name <p>
     *            The name of the product configuration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SupportedProductConfig withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     *
     * @return <p>
     *         The list of user-supplied arguments.
     *         </p>
     */
    public java.util.List<String> getArgs() {
        return args;
    }

    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     *
     * @param args <p>
     *            The list of user-supplied arguments.
     *            </p>
     */
    public void setArgs(java.util.Collection<String> args) {
        if (args == null) {
            this.args = null;
            return;
        }

        this.args = new java.util.ArrayList<String>(args);
    }

    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            The list of user-supplied arguments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SupportedProductConfig withArgs(String... args) {
        if (getArgs() == null) {
            this.args = new java.util.ArrayList<String>(args.length);
        }
        for (String value : args) {
            this.args.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of user-supplied arguments.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param args <p>
     *            The list of user-supplied arguments.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SupportedProductConfig withArgs(java.util.Collection<String> args) {
        setArgs(args);
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
            sb.append("Name: " + getName() + ",");
        if (getArgs() != null)
            sb.append("Args: " + getArgs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArgs() == null) ? 0 : getArgs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedProductConfig == false)
            return false;
        SupportedProductConfig other = (SupportedProductConfig) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArgs() == null ^ this.getArgs() == null)
            return false;
        if (other.getArgs() != null && other.getArgs().equals(this.getArgs()) == false)
            return false;
        return true;
    }
}
