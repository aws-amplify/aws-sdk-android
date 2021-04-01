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

package com.amazonaws.services.lexrts.model;

import java.io.Serializable;

/**
 * <p>
 * A context is a variable that contains information about the current state of
 * the conversation between a user and Amazon Lex. Context can be set
 * automatically by Amazon Lex when an intent is fulfilled, or it can be set at
 * runtime using the <code>PutContent</code>, <code>PutText</code>, or
 * <code>PutSession</code> operation.
 * </p>
 */
public class ActiveContext implements Serializable {
    /**
     * <p>
     * The name of the context.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     */
    private String name;

    /**
     * <p>
     * The length of time or number of turns that a context remains active.
     * </p>
     */
    private ActiveContextTimeToLive timeToLive;

    /**
     * <p>
     * State variables for the current context. You can use these values as
     * default values for slots in subsequent events.
     * </p>
     */
    private java.util.Map<String, String> parameters;

    /**
     * <p>
     * The name of the context.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @return <p>
     *         The name of the context.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the context.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the context.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     * <b>Pattern: </b>^([A-Za-z]_?)+$<br/>
     *
     * @param name <p>
     *            The name of the context.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveContext withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The length of time or number of turns that a context remains active.
     * </p>
     *
     * @return <p>
     *         The length of time or number of turns that a context remains
     *         active.
     *         </p>
     */
    public ActiveContextTimeToLive getTimeToLive() {
        return timeToLive;
    }

    /**
     * <p>
     * The length of time or number of turns that a context remains active.
     * </p>
     *
     * @param timeToLive <p>
     *            The length of time or number of turns that a context remains
     *            active.
     *            </p>
     */
    public void setTimeToLive(ActiveContextTimeToLive timeToLive) {
        this.timeToLive = timeToLive;
    }

    /**
     * <p>
     * The length of time or number of turns that a context remains active.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timeToLive <p>
     *            The length of time or number of turns that a context remains
     *            active.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveContext withTimeToLive(ActiveContextTimeToLive timeToLive) {
        this.timeToLive = timeToLive;
        return this;
    }

    /**
     * <p>
     * State variables for the current context. You can use these values as
     * default values for slots in subsequent events.
     * </p>
     *
     * @return <p>
     *         State variables for the current context. You can use these values
     *         as default values for slots in subsequent events.
     *         </p>
     */
    public java.util.Map<String, String> getParameters() {
        return parameters;
    }

    /**
     * <p>
     * State variables for the current context. You can use these values as
     * default values for slots in subsequent events.
     * </p>
     *
     * @param parameters <p>
     *            State variables for the current context. You can use these
     *            values as default values for slots in subsequent events.
     *            </p>
     */
    public void setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
    }

    /**
     * <p>
     * State variables for the current context. You can use these values as
     * default values for slots in subsequent events.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameters <p>
     *            State variables for the current context. You can use these
     *            values as default values for slots in subsequent events.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveContext withParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * <p>
     * State variables for the current context. You can use these values as
     * default values for slots in subsequent events.
     * </p>
     * <p>
     * The method adds a new key-value pair into parameters parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into parameters.
     * @param value The corresponding value of the entry to be added into
     *            parameters.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ActiveContext addparametersEntry(String key, String value) {
        if (null == this.parameters) {
            this.parameters = new java.util.HashMap<String, String>();
        }
        if (this.parameters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.parameters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into parameters.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public ActiveContext clearparametersEntries() {
        this.parameters = null;
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
        if (getTimeToLive() != null)
            sb.append("timeToLive: " + getTimeToLive() + ",");
        if (getParameters() != null)
            sb.append("parameters: " + getParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getTimeToLive() == null) ? 0 : getTimeToLive().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ActiveContext == false)
            return false;
        ActiveContext other = (ActiveContext) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getTimeToLive() == null ^ this.getTimeToLive() == null)
            return false;
        if (other.getTimeToLive() != null
                && other.getTimeToLive().equals(this.getTimeToLive()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null
                && other.getParameters().equals(this.getParameters()) == false)
            return false;
        return true;
    }
}
