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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * ESAM ManifestConfirmConditionNotification defined by
 * OC-SP-ESAM-API-I03-131025.
 */
public class EsamManifestConfirmConditionNotification implements Serializable {
    /**
     * Provide your ESAM ManifestConfirmConditionNotification XML document
     * inside your JSON job settings. Form the XML document as per
     * OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest
     * Conditioning instructions in the message that you supply.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^\s*<(.|\n)*ManifestConfirmConditionNotification(.|\n)*>\s*$<br/>
     */
    private String mccXml;

    /**
     * Provide your ESAM ManifestConfirmConditionNotification XML document
     * inside your JSON job settings. Form the XML document as per
     * OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest
     * Conditioning instructions in the message that you supply.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^\s*<(.|\n)*ManifestConfirmConditionNotification(.|\n)*>\s*$<br/>
     *
     * @return Provide your ESAM ManifestConfirmConditionNotification XML
     *         document inside your JSON job settings. Form the XML document as
     *         per OC-SP-ESAM-API-I03-131025. The transcoder will use the
     *         Manifest Conditioning instructions in the message that you
     *         supply.
     */
    public String getMccXml() {
        return mccXml;
    }

    /**
     * Provide your ESAM ManifestConfirmConditionNotification XML document
     * inside your JSON job settings. Form the XML document as per
     * OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest
     * Conditioning instructions in the message that you supply.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^\s*<(.|\n)*ManifestConfirmConditionNotification(.|\n)*>\s*$<br/>
     *
     * @param mccXml Provide your ESAM ManifestConfirmConditionNotification XML
     *            document inside your JSON job settings. Form the XML document
     *            as per OC-SP-ESAM-API-I03-131025. The transcoder will use the
     *            Manifest Conditioning instructions in the message that you
     *            supply.
     */
    public void setMccXml(String mccXml) {
        this.mccXml = mccXml;
    }

    /**
     * Provide your ESAM ManifestConfirmConditionNotification XML document
     * inside your JSON job settings. Form the XML document as per
     * OC-SP-ESAM-API-I03-131025. The transcoder will use the Manifest
     * Conditioning instructions in the message that you supply.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>^\s*<(.|\n)*ManifestConfirmConditionNotification(.|\n)*>\s*$<br/>
     *
     * @param mccXml Provide your ESAM ManifestConfirmConditionNotification XML
     *            document inside your JSON job settings. Form the XML document
     *            as per OC-SP-ESAM-API-I03-131025. The transcoder will use the
     *            Manifest Conditioning instructions in the message that you
     *            supply.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EsamManifestConfirmConditionNotification withMccXml(String mccXml) {
        this.mccXml = mccXml;
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
        if (getMccXml() != null)
            sb.append("MccXml: " + getMccXml());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMccXml() == null) ? 0 : getMccXml().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EsamManifestConfirmConditionNotification == false)
            return false;
        EsamManifestConfirmConditionNotification other = (EsamManifestConfirmConditionNotification) obj;

        if (other.getMccXml() == null ^ this.getMccXml() == null)
            return false;
        if (other.getMccXml() != null && other.getMccXml().equals(this.getMccXml()) == false)
            return false;
        return true;
    }
}
