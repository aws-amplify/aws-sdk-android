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

package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;

/**
 * Specify the details for each pair of HLS and DASH additional manifests that
 * you want the service to generate for this CMAF output group. Each pair of
 * manifests can reference a different subset of outputs in the group.
 */
public class CmafAdditionalManifest implements Serializable {
    /**
     * Specify a name modifier that the service adds to the name of this
     * manifest to make it different from the file names of the other main
     * manifests in the output group. For example, say that the default main
     * manifest for your HLS group is film-name.m3u8. If you enter "-no-premium"
     * for this setting, then the file name the service generates for this
     * top-level manifest is film-name-no-premium.m3u8. For HLS output groups,
     * specify a manifestNameModifier that is different from the nameModifier of
     * the output. The service uses the output name modifier to create unique
     * names for the individual variant manifests.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String manifestNameModifier;

    /**
     * Specify the outputs that you want this additional top-level manifest to
     * reference.
     */
    private java.util.List<String> selectedOutputs;

    /**
     * Specify a name modifier that the service adds to the name of this
     * manifest to make it different from the file names of the other main
     * manifests in the output group. For example, say that the default main
     * manifest for your HLS group is film-name.m3u8. If you enter "-no-premium"
     * for this setting, then the file name the service generates for this
     * top-level manifest is film-name-no-premium.m3u8. For HLS output groups,
     * specify a manifestNameModifier that is different from the nameModifier of
     * the output. The service uses the output name modifier to create unique
     * names for the individual variant manifests.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return Specify a name modifier that the service adds to the name of this
     *         manifest to make it different from the file names of the other
     *         main manifests in the output group. For example, say that the
     *         default main manifest for your HLS group is film-name.m3u8. If
     *         you enter "-no-premium" for this setting, then the file name the
     *         service generates for this top-level manifest is
     *         film-name-no-premium.m3u8. For HLS output groups, specify a
     *         manifestNameModifier that is different from the nameModifier of
     *         the output. The service uses the output name modifier to create
     *         unique names for the individual variant manifests.
     */
    public String getManifestNameModifier() {
        return manifestNameModifier;
    }

    /**
     * Specify a name modifier that the service adds to the name of this
     * manifest to make it different from the file names of the other main
     * manifests in the output group. For example, say that the default main
     * manifest for your HLS group is film-name.m3u8. If you enter "-no-premium"
     * for this setting, then the file name the service generates for this
     * top-level manifest is film-name-no-premium.m3u8. For HLS output groups,
     * specify a manifestNameModifier that is different from the nameModifier of
     * the output. The service uses the output name modifier to create unique
     * names for the individual variant manifests.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param manifestNameModifier Specify a name modifier that the service adds
     *            to the name of this manifest to make it different from the
     *            file names of the other main manifests in the output group.
     *            For example, say that the default main manifest for your HLS
     *            group is film-name.m3u8. If you enter "-no-premium" for this
     *            setting, then the file name the service generates for this
     *            top-level manifest is film-name-no-premium.m3u8. For HLS
     *            output groups, specify a manifestNameModifier that is
     *            different from the nameModifier of the output. The service
     *            uses the output name modifier to create unique names for the
     *            individual variant manifests.
     */
    public void setManifestNameModifier(String manifestNameModifier) {
        this.manifestNameModifier = manifestNameModifier;
    }

    /**
     * Specify a name modifier that the service adds to the name of this
     * manifest to make it different from the file names of the other main
     * manifests in the output group. For example, say that the default main
     * manifest for your HLS group is film-name.m3u8. If you enter "-no-premium"
     * for this setting, then the file name the service generates for this
     * top-level manifest is film-name-no-premium.m3u8. For HLS output groups,
     * specify a manifestNameModifier that is different from the nameModifier of
     * the output. The service uses the output name modifier to create unique
     * names for the individual variant manifests.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param manifestNameModifier Specify a name modifier that the service adds
     *            to the name of this manifest to make it different from the
     *            file names of the other main manifests in the output group.
     *            For example, say that the default main manifest for your HLS
     *            group is film-name.m3u8. If you enter "-no-premium" for this
     *            setting, then the file name the service generates for this
     *            top-level manifest is film-name-no-premium.m3u8. For HLS
     *            output groups, specify a manifestNameModifier that is
     *            different from the nameModifier of the output. The service
     *            uses the output name modifier to create unique names for the
     *            individual variant manifests.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CmafAdditionalManifest withManifestNameModifier(String manifestNameModifier) {
        this.manifestNameModifier = manifestNameModifier;
        return this;
    }

    /**
     * Specify the outputs that you want this additional top-level manifest to
     * reference.
     *
     * @return Specify the outputs that you want this additional top-level
     *         manifest to reference.
     */
    public java.util.List<String> getSelectedOutputs() {
        return selectedOutputs;
    }

    /**
     * Specify the outputs that you want this additional top-level manifest to
     * reference.
     *
     * @param selectedOutputs Specify the outputs that you want this additional
     *            top-level manifest to reference.
     */
    public void setSelectedOutputs(java.util.Collection<String> selectedOutputs) {
        if (selectedOutputs == null) {
            this.selectedOutputs = null;
            return;
        }

        this.selectedOutputs = new java.util.ArrayList<String>(selectedOutputs);
    }

    /**
     * Specify the outputs that you want this additional top-level manifest to
     * reference.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectedOutputs Specify the outputs that you want this additional
     *            top-level manifest to reference.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CmafAdditionalManifest withSelectedOutputs(String... selectedOutputs) {
        if (getSelectedOutputs() == null) {
            this.selectedOutputs = new java.util.ArrayList<String>(selectedOutputs.length);
        }
        for (String value : selectedOutputs) {
            this.selectedOutputs.add(value);
        }
        return this;
    }

    /**
     * Specify the outputs that you want this additional top-level manifest to
     * reference.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param selectedOutputs Specify the outputs that you want this additional
     *            top-level manifest to reference.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CmafAdditionalManifest withSelectedOutputs(java.util.Collection<String> selectedOutputs) {
        setSelectedOutputs(selectedOutputs);
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
        if (getManifestNameModifier() != null)
            sb.append("ManifestNameModifier: " + getManifestNameModifier() + ",");
        if (getSelectedOutputs() != null)
            sb.append("SelectedOutputs: " + getSelectedOutputs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getManifestNameModifier() == null) ? 0 : getManifestNameModifier().hashCode());
        hashCode = prime * hashCode
                + ((getSelectedOutputs() == null) ? 0 : getSelectedOutputs().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CmafAdditionalManifest == false)
            return false;
        CmafAdditionalManifest other = (CmafAdditionalManifest) obj;

        if (other.getManifestNameModifier() == null ^ this.getManifestNameModifier() == null)
            return false;
        if (other.getManifestNameModifier() != null
                && other.getManifestNameModifier().equals(this.getManifestNameModifier()) == false)
            return false;
        if (other.getSelectedOutputs() == null ^ this.getSelectedOutputs() == null)
            return false;
        if (other.getSelectedOutputs() != null
                && other.getSelectedOutputs().equals(this.getSelectedOutputs()) == false)
            return false;
        return true;
    }
}
