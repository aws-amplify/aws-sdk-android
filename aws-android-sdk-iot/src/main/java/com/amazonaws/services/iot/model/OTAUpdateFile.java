/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a file to be associated with an OTA update.
 * </p>
 */
public class OTAUpdateFile implements Serializable {
    /**
     * <p>
     * The name of the file.
     * </p>
     */
    private String fileName;

    /**
     * <p>
     * The file version.
     * </p>
     */
    private String fileVersion;

    /**
     * <p>
     * The location of the updated firmware.
     * </p>
     */
    private FileLocation fileLocation;

    /**
     * <p>
     * The code signing method of the file.
     * </p>
     */
    private CodeSigning codeSigning;

    /**
     * <p>
     * A list of name/attribute pairs.
     * </p>
     */
    private java.util.Map<String, String> attributes;

    /**
     * <p>
     * The name of the file.
     * </p>
     *
     * @return <p>
     *         The name of the file.
     *         </p>
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * <p>
     * The name of the file.
     * </p>
     *
     * @param fileName <p>
     *            The name of the file.
     *            </p>
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     * <p>
     * The name of the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileName <p>
     *            The name of the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateFile withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * <p>
     * The file version.
     * </p>
     *
     * @return <p>
     *         The file version.
     *         </p>
     */
    public String getFileVersion() {
        return fileVersion;
    }

    /**
     * <p>
     * The file version.
     * </p>
     *
     * @param fileVersion <p>
     *            The file version.
     *            </p>
     */
    public void setFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
    }

    /**
     * <p>
     * The file version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileVersion <p>
     *            The file version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateFile withFileVersion(String fileVersion) {
        this.fileVersion = fileVersion;
        return this;
    }

    /**
     * <p>
     * The location of the updated firmware.
     * </p>
     *
     * @return <p>
     *         The location of the updated firmware.
     *         </p>
     */
    public FileLocation getFileLocation() {
        return fileLocation;
    }

    /**
     * <p>
     * The location of the updated firmware.
     * </p>
     *
     * @param fileLocation <p>
     *            The location of the updated firmware.
     *            </p>
     */
    public void setFileLocation(FileLocation fileLocation) {
        this.fileLocation = fileLocation;
    }

    /**
     * <p>
     * The location of the updated firmware.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fileLocation <p>
     *            The location of the updated firmware.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateFile withFileLocation(FileLocation fileLocation) {
        this.fileLocation = fileLocation;
        return this;
    }

    /**
     * <p>
     * The code signing method of the file.
     * </p>
     *
     * @return <p>
     *         The code signing method of the file.
     *         </p>
     */
    public CodeSigning getCodeSigning() {
        return codeSigning;
    }

    /**
     * <p>
     * The code signing method of the file.
     * </p>
     *
     * @param codeSigning <p>
     *            The code signing method of the file.
     *            </p>
     */
    public void setCodeSigning(CodeSigning codeSigning) {
        this.codeSigning = codeSigning;
    }

    /**
     * <p>
     * The code signing method of the file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param codeSigning <p>
     *            The code signing method of the file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateFile withCodeSigning(CodeSigning codeSigning) {
        this.codeSigning = codeSigning;
        return this;
    }

    /**
     * <p>
     * A list of name/attribute pairs.
     * </p>
     *
     * @return <p>
     *         A list of name/attribute pairs.
     *         </p>
     */
    public java.util.Map<String, String> getAttributes() {
        return attributes;
    }

    /**
     * <p>
     * A list of name/attribute pairs.
     * </p>
     *
     * @param attributes <p>
     *            A list of name/attribute pairs.
     *            </p>
     */
    public void setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
    }

    /**
     * <p>
     * A list of name/attribute pairs.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributes <p>
     *            A list of name/attribute pairs.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateFile withAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * <p>
     * A list of name/attribute pairs.
     * </p>
     * <p>
     * The method adds a new key-value pair into attributes parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into attributes.
     * @param value The corresponding value of the entry to be added into
     *            attributes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OTAUpdateFile addattributesEntry(String key, String value) {
        if (null == this.attributes) {
            this.attributes = new java.util.HashMap<String, String>();
        }
        if (this.attributes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.attributes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into attributes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public OTAUpdateFile clearattributesEntries() {
        this.attributes = null;
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
        if (getFileName() != null)
            sb.append("fileName: " + getFileName() + ",");
        if (getFileVersion() != null)
            sb.append("fileVersion: " + getFileVersion() + ",");
        if (getFileLocation() != null)
            sb.append("fileLocation: " + getFileLocation() + ",");
        if (getCodeSigning() != null)
            sb.append("codeSigning: " + getCodeSigning() + ",");
        if (getAttributes() != null)
            sb.append("attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFileName() == null) ? 0 : getFileName().hashCode());
        hashCode = prime * hashCode
                + ((getFileVersion() == null) ? 0 : getFileVersion().hashCode());
        hashCode = prime * hashCode
                + ((getFileLocation() == null) ? 0 : getFileLocation().hashCode());
        hashCode = prime * hashCode
                + ((getCodeSigning() == null) ? 0 : getCodeSigning().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OTAUpdateFile == false)
            return false;
        OTAUpdateFile other = (OTAUpdateFile) obj;

        if (other.getFileName() == null ^ this.getFileName() == null)
            return false;
        if (other.getFileName() != null && other.getFileName().equals(this.getFileName()) == false)
            return false;
        if (other.getFileVersion() == null ^ this.getFileVersion() == null)
            return false;
        if (other.getFileVersion() != null
                && other.getFileVersion().equals(this.getFileVersion()) == false)
            return false;
        if (other.getFileLocation() == null ^ this.getFileLocation() == null)
            return false;
        if (other.getFileLocation() != null
                && other.getFileLocation().equals(this.getFileLocation()) == false)
            return false;
        if (other.getCodeSigning() == null ^ this.getCodeSigning() == null)
            return false;
        if (other.getCodeSigning() != null
                && other.getCodeSigning().equals(this.getCodeSigning()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null
                && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }
}
