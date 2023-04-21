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

package com.amazonaws.services.rekognition.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Allows you to update a stream processor. You can change some settings and
 * regions of interest and delete certain parameters.
 * </p>
 */
public class UpdateStreamProcessorRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * Name of the stream processor that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     */
    private String name;

    /**
     * <p>
     * The stream processor settings that you want to update. Label detection
     * settings can be updated to detect different labels with a different
     * minimum confidence.
     * </p>
     */
    private StreamProcessorSettingsForUpdate settingsForUpdate;

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. This is an optional parameter for label detection
     * stream processors.
     * </p>
     */
    private java.util.List<RegionOfInterest> regionsOfInterestForUpdate;

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model
     * performance. You can choose this option at the account level or on a
     * per-stream basis. Note that if you opt out at the account level this
     * setting is ignored on individual streams.
     * </p>
     */
    private StreamProcessorDataSharingPreference dataSharingPreferenceForUpdate;

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     */
    private java.util.List<String> parametersToDelete;

    /**
     * <p>
     * Name of the stream processor that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @return <p>
     *         Name of the stream processor that you want to update.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * Name of the stream processor that you want to update.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param name <p>
     *            Name of the stream processor that you want to update.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the stream processor that you want to update.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.\-]+<br/>
     *
     * @param name <p>
     *            Name of the stream processor that you want to update.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamProcessorRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The stream processor settings that you want to update. Label detection
     * settings can be updated to detect different labels with a different
     * minimum confidence.
     * </p>
     *
     * @return <p>
     *         The stream processor settings that you want to update. Label
     *         detection settings can be updated to detect different labels with
     *         a different minimum confidence.
     *         </p>
     */
    public StreamProcessorSettingsForUpdate getSettingsForUpdate() {
        return settingsForUpdate;
    }

    /**
     * <p>
     * The stream processor settings that you want to update. Label detection
     * settings can be updated to detect different labels with a different
     * minimum confidence.
     * </p>
     *
     * @param settingsForUpdate <p>
     *            The stream processor settings that you want to update. Label
     *            detection settings can be updated to detect different labels
     *            with a different minimum confidence.
     *            </p>
     */
    public void setSettingsForUpdate(StreamProcessorSettingsForUpdate settingsForUpdate) {
        this.settingsForUpdate = settingsForUpdate;
    }

    /**
     * <p>
     * The stream processor settings that you want to update. Label detection
     * settings can be updated to detect different labels with a different
     * minimum confidence.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param settingsForUpdate <p>
     *            The stream processor settings that you want to update. Label
     *            detection settings can be updated to detect different labels
     *            with a different minimum confidence.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamProcessorRequest withSettingsForUpdate(
            StreamProcessorSettingsForUpdate settingsForUpdate) {
        this.settingsForUpdate = settingsForUpdate;
        return this;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. This is an optional parameter for label detection
     * stream processors.
     * </p>
     *
     * @return <p>
     *         Specifies locations in the frames where Amazon Rekognition checks
     *         for objects or people. This is an optional parameter for label
     *         detection stream processors.
     *         </p>
     */
    public java.util.List<RegionOfInterest> getRegionsOfInterestForUpdate() {
        return regionsOfInterestForUpdate;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. This is an optional parameter for label detection
     * stream processors.
     * </p>
     *
     * @param regionsOfInterestForUpdate <p>
     *            Specifies locations in the frames where Amazon Rekognition
     *            checks for objects or people. This is an optional parameter
     *            for label detection stream processors.
     *            </p>
     */
    public void setRegionsOfInterestForUpdate(
            java.util.Collection<RegionOfInterest> regionsOfInterestForUpdate) {
        if (regionsOfInterestForUpdate == null) {
            this.regionsOfInterestForUpdate = null;
            return;
        }

        this.regionsOfInterestForUpdate = new java.util.ArrayList<RegionOfInterest>(
                regionsOfInterestForUpdate);
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. This is an optional parameter for label detection
     * stream processors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionsOfInterestForUpdate <p>
     *            Specifies locations in the frames where Amazon Rekognition
     *            checks for objects or people. This is an optional parameter
     *            for label detection stream processors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamProcessorRequest withRegionsOfInterestForUpdate(
            RegionOfInterest... regionsOfInterestForUpdate) {
        if (getRegionsOfInterestForUpdate() == null) {
            this.regionsOfInterestForUpdate = new java.util.ArrayList<RegionOfInterest>(
                    regionsOfInterestForUpdate.length);
        }
        for (RegionOfInterest value : regionsOfInterestForUpdate) {
            this.regionsOfInterestForUpdate.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Specifies locations in the frames where Amazon Rekognition checks for
     * objects or people. This is an optional parameter for label detection
     * stream processors.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionsOfInterestForUpdate <p>
     *            Specifies locations in the frames where Amazon Rekognition
     *            checks for objects or people. This is an optional parameter
     *            for label detection stream processors.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamProcessorRequest withRegionsOfInterestForUpdate(
            java.util.Collection<RegionOfInterest> regionsOfInterestForUpdate) {
        setRegionsOfInterestForUpdate(regionsOfInterestForUpdate);
        return this;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model
     * performance. You can choose this option at the account level or on a
     * per-stream basis. Note that if you opt out at the account level this
     * setting is ignored on individual streams.
     * </p>
     *
     * @return <p>
     *         Shows whether you are sharing data with Rekognition to improve
     *         model performance. You can choose this option at the account
     *         level or on a per-stream basis. Note that if you opt out at the
     *         account level this setting is ignored on individual streams.
     *         </p>
     */
    public StreamProcessorDataSharingPreference getDataSharingPreferenceForUpdate() {
        return dataSharingPreferenceForUpdate;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model
     * performance. You can choose this option at the account level or on a
     * per-stream basis. Note that if you opt out at the account level this
     * setting is ignored on individual streams.
     * </p>
     *
     * @param dataSharingPreferenceForUpdate <p>
     *            Shows whether you are sharing data with Rekognition to improve
     *            model performance. You can choose this option at the account
     *            level or on a per-stream basis. Note that if you opt out at
     *            the account level this setting is ignored on individual
     *            streams.
     *            </p>
     */
    public void setDataSharingPreferenceForUpdate(
            StreamProcessorDataSharingPreference dataSharingPreferenceForUpdate) {
        this.dataSharingPreferenceForUpdate = dataSharingPreferenceForUpdate;
    }

    /**
     * <p>
     * Shows whether you are sharing data with Rekognition to improve model
     * performance. You can choose this option at the account level or on a
     * per-stream basis. Note that if you opt out at the account level this
     * setting is ignored on individual streams.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dataSharingPreferenceForUpdate <p>
     *            Shows whether you are sharing data with Rekognition to improve
     *            model performance. You can choose this option at the account
     *            level or on a per-stream basis. Note that if you opt out at
     *            the account level this setting is ignored on individual
     *            streams.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamProcessorRequest withDataSharingPreferenceForUpdate(
            StreamProcessorDataSharingPreference dataSharingPreferenceForUpdate) {
        this.dataSharingPreferenceForUpdate = dataSharingPreferenceForUpdate;
        return this;
    }

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     *
     * @return <p>
     *         A list of parameters you want to delete from the stream
     *         processor.
     *         </p>
     */
    public java.util.List<String> getParametersToDelete() {
        return parametersToDelete;
    }

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     *
     * @param parametersToDelete <p>
     *            A list of parameters you want to delete from the stream
     *            processor.
     *            </p>
     */
    public void setParametersToDelete(java.util.Collection<String> parametersToDelete) {
        if (parametersToDelete == null) {
            this.parametersToDelete = null;
            return;
        }

        this.parametersToDelete = new java.util.ArrayList<String>(parametersToDelete);
    }

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parametersToDelete <p>
     *            A list of parameters you want to delete from the stream
     *            processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamProcessorRequest withParametersToDelete(String... parametersToDelete) {
        if (getParametersToDelete() == null) {
            this.parametersToDelete = new java.util.ArrayList<String>(parametersToDelete.length);
        }
        for (String value : parametersToDelete) {
            this.parametersToDelete.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters you want to delete from the stream processor.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parametersToDelete <p>
     *            A list of parameters you want to delete from the stream
     *            processor.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStreamProcessorRequest withParametersToDelete(
            java.util.Collection<String> parametersToDelete) {
        setParametersToDelete(parametersToDelete);
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
        if (getSettingsForUpdate() != null)
            sb.append("SettingsForUpdate: " + getSettingsForUpdate() + ",");
        if (getRegionsOfInterestForUpdate() != null)
            sb.append("RegionsOfInterestForUpdate: " + getRegionsOfInterestForUpdate() + ",");
        if (getDataSharingPreferenceForUpdate() != null)
            sb.append("DataSharingPreferenceForUpdate: " + getDataSharingPreferenceForUpdate()
                    + ",");
        if (getParametersToDelete() != null)
            sb.append("ParametersToDelete: " + getParametersToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode
                + ((getSettingsForUpdate() == null) ? 0 : getSettingsForUpdate().hashCode());
        hashCode = prime
                * hashCode
                + ((getRegionsOfInterestForUpdate() == null) ? 0 : getRegionsOfInterestForUpdate()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDataSharingPreferenceForUpdate() == null) ? 0
                        : getDataSharingPreferenceForUpdate().hashCode());
        hashCode = prime * hashCode
                + ((getParametersToDelete() == null) ? 0 : getParametersToDelete().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStreamProcessorRequest == false)
            return false;
        UpdateStreamProcessorRequest other = (UpdateStreamProcessorRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSettingsForUpdate() == null ^ this.getSettingsForUpdate() == null)
            return false;
        if (other.getSettingsForUpdate() != null
                && other.getSettingsForUpdate().equals(this.getSettingsForUpdate()) == false)
            return false;
        if (other.getRegionsOfInterestForUpdate() == null
                ^ this.getRegionsOfInterestForUpdate() == null)
            return false;
        if (other.getRegionsOfInterestForUpdate() != null
                && other.getRegionsOfInterestForUpdate().equals(
                        this.getRegionsOfInterestForUpdate()) == false)
            return false;
        if (other.getDataSharingPreferenceForUpdate() == null
                ^ this.getDataSharingPreferenceForUpdate() == null)
            return false;
        if (other.getDataSharingPreferenceForUpdate() != null
                && other.getDataSharingPreferenceForUpdate().equals(
                        this.getDataSharingPreferenceForUpdate()) == false)
            return false;
        if (other.getParametersToDelete() == null ^ this.getParametersToDelete() == null)
            return false;
        if (other.getParametersToDelete() != null
                && other.getParametersToDelete().equals(this.getParametersToDelete()) == false)
            return false;
        return true;
    }
}
