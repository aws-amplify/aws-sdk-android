/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

public class ImportTerminologyResult implements Serializable {
    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     */
    private TerminologyProperties terminologyProperties;

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a terminology resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     */
    private TerminologyDataLocation auxiliaryDataLocation;

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     *
     * @return <p>
     *         The properties of the custom terminology being imported.
     *         </p>
     */
    public TerminologyProperties getTerminologyProperties() {
        return terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     *
     * @param terminologyProperties <p>
     *            The properties of the custom terminology being imported.
     *            </p>
     */
    public void setTerminologyProperties(TerminologyProperties terminologyProperties) {
        this.terminologyProperties = terminologyProperties;
    }

    /**
     * <p>
     * The properties of the custom terminology being imported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param terminologyProperties <p>
     *            The properties of the custom terminology being imported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportTerminologyResult withTerminologyProperties(
            TerminologyProperties terminologyProperties) {
        this.terminologyProperties = terminologyProperties;
        return this;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a terminology resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 location of a file that provides any errors or
     *         warnings that were produced by your input file. This file was
     *         created when Amazon Translate attempted to create a terminology
     *         resource. The location is returned as a presigned URL to that has
     *         a 30 minute expiration.
     *         </p>
     */
    public TerminologyDataLocation getAuxiliaryDataLocation() {
        return auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a terminology resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     *
     * @param auxiliaryDataLocation <p>
     *            The Amazon S3 location of a file that provides any errors or
     *            warnings that were produced by your input file. This file was
     *            created when Amazon Translate attempted to create a
     *            terminology resource. The location is returned as a presigned
     *            URL to that has a 30 minute expiration.
     *            </p>
     */
    public void setAuxiliaryDataLocation(TerminologyDataLocation auxiliaryDataLocation) {
        this.auxiliaryDataLocation = auxiliaryDataLocation;
    }

    /**
     * <p>
     * The Amazon S3 location of a file that provides any errors or warnings
     * that were produced by your input file. This file was created when Amazon
     * Translate attempted to create a terminology resource. The location is
     * returned as a presigned URL to that has a 30 minute expiration.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param auxiliaryDataLocation <p>
     *            The Amazon S3 location of a file that provides any errors or
     *            warnings that were produced by your input file. This file was
     *            created when Amazon Translate attempted to create a
     *            terminology resource. The location is returned as a presigned
     *            URL to that has a 30 minute expiration.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ImportTerminologyResult withAuxiliaryDataLocation(
            TerminologyDataLocation auxiliaryDataLocation) {
        this.auxiliaryDataLocation = auxiliaryDataLocation;
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
        if (getTerminologyProperties() != null)
            sb.append("TerminologyProperties: " + getTerminologyProperties() + ",");
        if (getAuxiliaryDataLocation() != null)
            sb.append("AuxiliaryDataLocation: " + getAuxiliaryDataLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTerminologyProperties() == null) ? 0 : getTerminologyProperties().hashCode());
        hashCode = prime
                * hashCode
                + ((getAuxiliaryDataLocation() == null) ? 0 : getAuxiliaryDataLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportTerminologyResult == false)
            return false;
        ImportTerminologyResult other = (ImportTerminologyResult) obj;

        if (other.getTerminologyProperties() == null ^ this.getTerminologyProperties() == null)
            return false;
        if (other.getTerminologyProperties() != null
                && other.getTerminologyProperties().equals(this.getTerminologyProperties()) == false)
            return false;
        if (other.getAuxiliaryDataLocation() == null ^ this.getAuxiliaryDataLocation() == null)
            return false;
        if (other.getAuxiliaryDataLocation() != null
                && other.getAuxiliaryDataLocation().equals(this.getAuxiliaryDataLocation()) == false)
            return false;
        return true;
    }
}
