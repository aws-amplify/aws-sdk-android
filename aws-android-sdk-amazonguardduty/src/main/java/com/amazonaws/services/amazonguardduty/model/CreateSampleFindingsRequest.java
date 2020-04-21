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

package com.amazonaws.services.amazonguardduty.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Generates example findings of types specified by the list of finding types.
 * If 'NULL' is specified for <code>findingTypes</code>, the API generates
 * example findings of all supported finding types.
 * </p>
 */
public class CreateSampleFindingsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ID of the detector to create sample findings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     */
    private String detectorId;

    /**
     * <p>
     * The types of sample findings to generate.
     * </p>
     */
    private java.util.List<String> findingTypes;

    /**
     * <p>
     * The ID of the detector to create sample findings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @return <p>
     *         The ID of the detector to create sample findings for.
     *         </p>
     */
    public String getDetectorId() {
        return detectorId;
    }

    /**
     * <p>
     * The ID of the detector to create sample findings for.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector to create sample findings for.
     *            </p>
     */
    public void setDetectorId(String detectorId) {
        this.detectorId = detectorId;
    }

    /**
     * <p>
     * The ID of the detector to create sample findings for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 300<br/>
     *
     * @param detectorId <p>
     *            The ID of the detector to create sample findings for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSampleFindingsRequest withDetectorId(String detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * <p>
     * The types of sample findings to generate.
     * </p>
     *
     * @return <p>
     *         The types of sample findings to generate.
     *         </p>
     */
    public java.util.List<String> getFindingTypes() {
        return findingTypes;
    }

    /**
     * <p>
     * The types of sample findings to generate.
     * </p>
     *
     * @param findingTypes <p>
     *            The types of sample findings to generate.
     *            </p>
     */
    public void setFindingTypes(java.util.Collection<String> findingTypes) {
        if (findingTypes == null) {
            this.findingTypes = null;
            return;
        }

        this.findingTypes = new java.util.ArrayList<String>(findingTypes);
    }

    /**
     * <p>
     * The types of sample findings to generate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingTypes <p>
     *            The types of sample findings to generate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSampleFindingsRequest withFindingTypes(String... findingTypes) {
        if (getFindingTypes() == null) {
            this.findingTypes = new java.util.ArrayList<String>(findingTypes.length);
        }
        for (String value : findingTypes) {
            this.findingTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The types of sample findings to generate.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param findingTypes <p>
     *            The types of sample findings to generate.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateSampleFindingsRequest withFindingTypes(java.util.Collection<String> findingTypes) {
        setFindingTypes(findingTypes);
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
        if (getDetectorId() != null)
            sb.append("DetectorId: " + getDetectorId() + ",");
        if (getFindingTypes() != null)
            sb.append("FindingTypes: " + getFindingTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDetectorId() == null) ? 0 : getDetectorId().hashCode());
        hashCode = prime * hashCode
                + ((getFindingTypes() == null) ? 0 : getFindingTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSampleFindingsRequest == false)
            return false;
        CreateSampleFindingsRequest other = (CreateSampleFindingsRequest) obj;

        if (other.getDetectorId() == null ^ this.getDetectorId() == null)
            return false;
        if (other.getDetectorId() != null
                && other.getDetectorId().equals(this.getDetectorId()) == false)
            return false;
        if (other.getFindingTypes() == null ^ this.getFindingTypes() == null)
            return false;
        if (other.getFindingTypes() != null
                && other.getFindingTypes().equals(this.getFindingTypes()) == false)
            return false;
        return true;
    }
}
