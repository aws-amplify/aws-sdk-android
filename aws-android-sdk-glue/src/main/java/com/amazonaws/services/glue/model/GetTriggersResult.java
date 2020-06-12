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

package com.amazonaws.services.glue.model;

import java.io.Serializable;

public class GetTriggersResult implements Serializable {
    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     */
    private java.util.List<Trigger> triggers;

    /**
     * <p>
     * A continuation token, if not all the requested triggers have yet been
     * returned.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     *
     * @return <p>
     *         A list of triggers for the specified job.
     *         </p>
     */
    public java.util.List<Trigger> getTriggers() {
        return triggers;
    }

    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     *
     * @param triggers <p>
     *            A list of triggers for the specified job.
     *            </p>
     */
    public void setTriggers(java.util.Collection<Trigger> triggers) {
        if (triggers == null) {
            this.triggers = null;
            return;
        }

        this.triggers = new java.util.ArrayList<Trigger>(triggers);
    }

    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            A list of triggers for the specified job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTriggersResult withTriggers(Trigger... triggers) {
        if (getTriggers() == null) {
            this.triggers = new java.util.ArrayList<Trigger>(triggers.length);
        }
        for (Trigger value : triggers) {
            this.triggers.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of triggers for the specified job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param triggers <p>
     *            A list of triggers for the specified job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTriggersResult withTriggers(java.util.Collection<Trigger> triggers) {
        setTriggers(triggers);
        return this;
    }

    /**
     * <p>
     * A continuation token, if not all the requested triggers have yet been
     * returned.
     * </p>
     *
     * @return <p>
     *         A continuation token, if not all the requested triggers have yet
     *         been returned.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all the requested triggers have yet been
     * returned.
     * </p>
     *
     * @param nextToken <p>
     *            A continuation token, if not all the requested triggers have
     *            yet been returned.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A continuation token, if not all the requested triggers have yet been
     * returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            A continuation token, if not all the requested triggers have
     *            yet been returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetTriggersResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getTriggers() != null)
            sb.append("Triggers: " + getTriggers() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTriggers() == null) ? 0 : getTriggers().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTriggersResult == false)
            return false;
        GetTriggersResult other = (GetTriggersResult) obj;

        if (other.getTriggers() == null ^ this.getTriggers() == null)
            return false;
        if (other.getTriggers() != null && other.getTriggers().equals(this.getTriggers()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
