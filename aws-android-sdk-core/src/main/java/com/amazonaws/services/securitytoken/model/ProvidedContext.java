/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.securitytoken.model;

import java.io.Serializable;

/**
 * <p>
 * Reserved for future use.
 * </p>
 */
public class ProvidedContext implements Serializable {
    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     */
    private String providerArn;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     */
    private String contextAssertion;

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getProviderArn() {
        return providerArn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @param providerArn <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setProviderArn(String providerArn) {
        this.providerArn = providerArn;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     * <b>Pattern: </b>[
     * -\u007E\u0085\u00A0-\uD7FF\uE000-\uFFFD\u10000-\u10FFFF]+<br/>
     *
     * @param providerArn <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvidedContext withProviderArn(String providerArn) {
        this.providerArn = providerArn;
        return this;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @return <p>
     *         Reserved for future use.
     *         </p>
     */
    public String getContextAssertion() {
        return contextAssertion;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @param contextAssertion <p>
     *            Reserved for future use.
     *            </p>
     */
    public void setContextAssertion(String contextAssertion) {
        this.contextAssertion = contextAssertion;
    }

    /**
     * <p>
     * Reserved for future use.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 2048<br/>
     *
     * @param contextAssertion <p>
     *            Reserved for future use.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ProvidedContext withContextAssertion(String contextAssertion) {
        this.contextAssertion = contextAssertion;
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
        if (getProviderArn() != null)
            sb.append("ProviderArn: " + getProviderArn() + ",");
        if (getContextAssertion() != null)
            sb.append("ContextAssertion: " + getContextAssertion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getProviderArn() == null) ? 0 : getProviderArn().hashCode());
        hashCode = prime * hashCode
                + ((getContextAssertion() == null) ? 0 : getContextAssertion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProvidedContext == false)
            return false;
        ProvidedContext other = (ProvidedContext) obj;

        if (other.getProviderArn() == null ^ this.getProviderArn() == null)
            return false;
        if (other.getProviderArn() != null
                && other.getProviderArn().equals(this.getProviderArn()) == false)
            return false;
        if (other.getContextAssertion() == null ^ this.getContextAssertion() == null)
            return false;
        if (other.getContextAssertion() != null
                && other.getContextAssertion().equals(this.getContextAssertion()) == false)
            return false;
        return true;
    }
}
