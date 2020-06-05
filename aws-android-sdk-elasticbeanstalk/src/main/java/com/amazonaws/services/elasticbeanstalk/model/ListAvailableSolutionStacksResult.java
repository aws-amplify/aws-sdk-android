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
 * A list of available AWS Elastic Beanstalk solution stacks.
 * </p>
 */
public class ListAvailableSolutionStacksResult implements Serializable {
    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     */
    private java.util.List<String> solutionStacks;

    /**
     * <p>
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     * </p>
     */
    private java.util.List<SolutionStackDescription> solutionStackDetails;

    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     *
     * @return <p>
     *         A list of available solution stacks.
     *         </p>
     */
    public java.util.List<String> getSolutionStacks() {
        return solutionStacks;
    }

    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     *
     * @param solutionStacks <p>
     *            A list of available solution stacks.
     *            </p>
     */
    public void setSolutionStacks(java.util.Collection<String> solutionStacks) {
        if (solutionStacks == null) {
            this.solutionStacks = null;
            return;
        }

        this.solutionStacks = new java.util.ArrayList<String>(solutionStacks);
    }

    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStacks <p>
     *            A list of available solution stacks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAvailableSolutionStacksResult withSolutionStacks(String... solutionStacks) {
        if (getSolutionStacks() == null) {
            this.solutionStacks = new java.util.ArrayList<String>(solutionStacks.length);
        }
        for (String value : solutionStacks) {
            this.solutionStacks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of available solution stacks.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStacks <p>
     *            A list of available solution stacks.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAvailableSolutionStacksResult withSolutionStacks(
            java.util.Collection<String> solutionStacks) {
        setSolutionStacks(solutionStacks);
        return this;
    }

    /**
     * <p>
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     * </p>
     *
     * @return <p>
     *         A list of available solution stacks and their
     *         <a>SolutionStackDescription</a>.
     *         </p>
     */
    public java.util.List<SolutionStackDescription> getSolutionStackDetails() {
        return solutionStackDetails;
    }

    /**
     * <p>
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     * </p>
     *
     * @param solutionStackDetails <p>
     *            A list of available solution stacks and their
     *            <a>SolutionStackDescription</a>.
     *            </p>
     */
    public void setSolutionStackDetails(
            java.util.Collection<SolutionStackDescription> solutionStackDetails) {
        if (solutionStackDetails == null) {
            this.solutionStackDetails = null;
            return;
        }

        this.solutionStackDetails = new java.util.ArrayList<SolutionStackDescription>(
                solutionStackDetails);
    }

    /**
     * <p>
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStackDetails <p>
     *            A list of available solution stacks and their
     *            <a>SolutionStackDescription</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAvailableSolutionStacksResult withSolutionStackDetails(
            SolutionStackDescription... solutionStackDetails) {
        if (getSolutionStackDetails() == null) {
            this.solutionStackDetails = new java.util.ArrayList<SolutionStackDescription>(
                    solutionStackDetails.length);
        }
        for (SolutionStackDescription value : solutionStackDetails) {
            this.solutionStackDetails.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of available solution stacks and their
     * <a>SolutionStackDescription</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param solutionStackDetails <p>
     *            A list of available solution stacks and their
     *            <a>SolutionStackDescription</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAvailableSolutionStacksResult withSolutionStackDetails(
            java.util.Collection<SolutionStackDescription> solutionStackDetails) {
        setSolutionStackDetails(solutionStackDetails);
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
        if (getSolutionStacks() != null)
            sb.append("SolutionStacks: " + getSolutionStacks() + ",");
        if (getSolutionStackDetails() != null)
            sb.append("SolutionStackDetails: " + getSolutionStackDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getSolutionStacks() == null) ? 0 : getSolutionStacks().hashCode());
        hashCode = prime * hashCode
                + ((getSolutionStackDetails() == null) ? 0 : getSolutionStackDetails().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAvailableSolutionStacksResult == false)
            return false;
        ListAvailableSolutionStacksResult other = (ListAvailableSolutionStacksResult) obj;

        if (other.getSolutionStacks() == null ^ this.getSolutionStacks() == null)
            return false;
        if (other.getSolutionStacks() != null
                && other.getSolutionStacks().equals(this.getSolutionStacks()) == false)
            return false;
        if (other.getSolutionStackDetails() == null ^ this.getSolutionStackDetails() == null)
            return false;
        if (other.getSolutionStackDetails() != null
                && other.getSolutionStackDetails().equals(this.getSolutionStackDetails()) == false)
            return false;
        return true;
    }
}
