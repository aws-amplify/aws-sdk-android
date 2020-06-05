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
 * Describes the solution stack.
 * </p>
 */
public class SolutionStackDescription implements Serializable {
    /**
     * <p>
     * The name of the solution stack.
     * </p>
     */
    private String solutionStackName;

    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     */
    private java.util.List<String> permittedFileTypes;

    /**
     * <p>
     * The name of the solution stack.
     * </p>
     *
     * @return <p>
     *         The name of the solution stack.
     *         </p>
     */
    public String getSolutionStackName() {
        return solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack.
     * </p>
     *
     * @param solutionStackName <p>
     *            The name of the solution stack.
     *            </p>
     */
    public void setSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
    }

    /**
     * <p>
     * The name of the solution stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStackName <p>
     *            The name of the solution stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionStackDescription withSolutionStackName(String solutionStackName) {
        this.solutionStackName = solutionStackName;
        return this;
    }

    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     *
     * @return <p>
     *         The permitted file types allowed for a solution stack.
     *         </p>
     */
    public java.util.List<String> getPermittedFileTypes() {
        return permittedFileTypes;
    }

    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     *
     * @param permittedFileTypes <p>
     *            The permitted file types allowed for a solution stack.
     *            </p>
     */
    public void setPermittedFileTypes(java.util.Collection<String> permittedFileTypes) {
        if (permittedFileTypes == null) {
            this.permittedFileTypes = null;
            return;
        }

        this.permittedFileTypes = new java.util.ArrayList<String>(permittedFileTypes);
    }

    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permittedFileTypes <p>
     *            The permitted file types allowed for a solution stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionStackDescription withPermittedFileTypes(String... permittedFileTypes) {
        if (getPermittedFileTypes() == null) {
            this.permittedFileTypes = new java.util.ArrayList<String>(permittedFileTypes.length);
        }
        for (String value : permittedFileTypes) {
            this.permittedFileTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permitted file types allowed for a solution stack.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param permittedFileTypes <p>
     *            The permitted file types allowed for a solution stack.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SolutionStackDescription withPermittedFileTypes(
            java.util.Collection<String> permittedFileTypes) {
        setPermittedFileTypes(permittedFileTypes);
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
        if (getSolutionStackName() != null)
            sb.append("SolutionStackName: " + getSolutionStackName() + ",");
        if (getPermittedFileTypes() != null)
            sb.append("PermittedFileTypes: " + getPermittedFileTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSolutionStackName() == null) ? 0 : getSolutionStackName().hashCode());
        hashCode = prime * hashCode
                + ((getPermittedFileTypes() == null) ? 0 : getPermittedFileTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SolutionStackDescription == false)
            return false;
        SolutionStackDescription other = (SolutionStackDescription) obj;

        if (other.getSolutionStackName() == null ^ this.getSolutionStackName() == null)
            return false;
        if (other.getSolutionStackName() != null
                && other.getSolutionStackName().equals(this.getSolutionStackName()) == false)
            return false;
        if (other.getPermittedFileTypes() == null ^ this.getPermittedFileTypes() == null)
            return false;
        if (other.getPermittedFileTypes() != null
                && other.getPermittedFileTypes().equals(this.getPermittedFileTypes()) == false)
            return false;
        return true;
    }
}
