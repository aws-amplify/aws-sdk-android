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

package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Provides a list of steps for the cluster in reverse order unless you specify
 * <code>stepIds</code> with the request of filter by <code>StepStates</code>.
 * You can specify a maximum of ten <code>stepIDs</code>.
 * </p>
 */
public class ListStepsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The identifier of the cluster for which to list the steps.
     * </p>
     */
    private String clusterId;

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     */
    private java.util.List<String> stepStates;

    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * You can specify a maximum of ten Step IDs. The character constraint
     * applies to the overall length of the array.
     * </p>
     */
    private java.util.List<String> stepIds;

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The identifier of the cluster for which to list the steps.
     * </p>
     *
     * @return <p>
     *         The identifier of the cluster for which to list the steps.
     *         </p>
     */
    public String getClusterId() {
        return clusterId;
    }

    /**
     * <p>
     * The identifier of the cluster for which to list the steps.
     * </p>
     *
     * @param clusterId <p>
     *            The identifier of the cluster for which to list the steps.
     *            </p>
     */
    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * <p>
     * The identifier of the cluster for which to list the steps.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param clusterId <p>
     *            The identifier of the cluster for which to list the steps.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStepsRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     *
     * @return <p>
     *         The filter to limit the step list based on certain states.
     *         </p>
     */
    public java.util.List<String> getStepStates() {
        return stepStates;
    }

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     *
     * @param stepStates <p>
     *            The filter to limit the step list based on certain states.
     *            </p>
     */
    public void setStepStates(java.util.Collection<String> stepStates) {
        if (stepStates == null) {
            this.stepStates = null;
            return;
        }

        this.stepStates = new java.util.ArrayList<String>(stepStates);
    }

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepStates <p>
     *            The filter to limit the step list based on certain states.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStepsRequest withStepStates(String... stepStates) {
        if (getStepStates() == null) {
            this.stepStates = new java.util.ArrayList<String>(stepStates.length);
        }
        for (String value : stepStates) {
            this.stepStates.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filter to limit the step list based on certain states.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepStates <p>
     *            The filter to limit the step list based on certain states.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStepsRequest withStepStates(java.util.Collection<String> stepStates) {
        setStepStates(stepStates);
        return this;
    }

    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * You can specify a maximum of ten Step IDs. The character constraint
     * applies to the overall length of the array.
     * </p>
     *
     * @return <p>
     *         The filter to limit the step list based on the identifier of the
     *         steps. You can specify a maximum of ten Step IDs. The character
     *         constraint applies to the overall length of the array.
     *         </p>
     */
    public java.util.List<String> getStepIds() {
        return stepIds;
    }

    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * You can specify a maximum of ten Step IDs. The character constraint
     * applies to the overall length of the array.
     * </p>
     *
     * @param stepIds <p>
     *            The filter to limit the step list based on the identifier of
     *            the steps. You can specify a maximum of ten Step IDs. The
     *            character constraint applies to the overall length of the
     *            array.
     *            </p>
     */
    public void setStepIds(java.util.Collection<String> stepIds) {
        if (stepIds == null) {
            this.stepIds = null;
            return;
        }

        this.stepIds = new java.util.ArrayList<String>(stepIds);
    }

    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * You can specify a maximum of ten Step IDs. The character constraint
     * applies to the overall length of the array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepIds <p>
     *            The filter to limit the step list based on the identifier of
     *            the steps. You can specify a maximum of ten Step IDs. The
     *            character constraint applies to the overall length of the
     *            array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStepsRequest withStepIds(String... stepIds) {
        if (getStepIds() == null) {
            this.stepIds = new java.util.ArrayList<String>(stepIds.length);
        }
        for (String value : stepIds) {
            this.stepIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The filter to limit the step list based on the identifier of the steps.
     * You can specify a maximum of ten Step IDs. The character constraint
     * applies to the overall length of the array.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stepIds <p>
     *            The filter to limit the step list based on the identifier of
     *            the steps. You can specify a maximum of ten Step IDs. The
     *            character constraint applies to the overall length of the
     *            array.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStepsRequest withStepIds(java.util.Collection<String> stepIds) {
        setStepIds(stepIds);
        return this;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     *
     * @return <p>
     *         The pagination token that indicates the next set of results to
     *         retrieve.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     *
     * @param marker <p>
     *            The pagination token that indicates the next set of results to
     *            retrieve.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token that indicates the next set of results to retrieve.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param marker <p>
     *            The pagination token that indicates the next set of results to
     *            retrieve.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListStepsRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getClusterId() != null)
            sb.append("ClusterId: " + getClusterId() + ",");
        if (getStepStates() != null)
            sb.append("StepStates: " + getStepStates() + ",");
        if (getStepIds() != null)
            sb.append("StepIds: " + getStepIds() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterId() == null) ? 0 : getClusterId().hashCode());
        hashCode = prime * hashCode + ((getStepStates() == null) ? 0 : getStepStates().hashCode());
        hashCode = prime * hashCode + ((getStepIds() == null) ? 0 : getStepIds().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListStepsRequest == false)
            return false;
        ListStepsRequest other = (ListStepsRequest) obj;

        if (other.getClusterId() == null ^ this.getClusterId() == null)
            return false;
        if (other.getClusterId() != null
                && other.getClusterId().equals(this.getClusterId()) == false)
            return false;
        if (other.getStepStates() == null ^ this.getStepStates() == null)
            return false;
        if (other.getStepStates() != null
                && other.getStepStates().equals(this.getStepStates()) == false)
            return false;
        if (other.getStepIds() == null ^ this.getStepIds() == null)
            return false;
        if (other.getStepIds() != null && other.getStepIds().equals(this.getStepIds()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }
}
