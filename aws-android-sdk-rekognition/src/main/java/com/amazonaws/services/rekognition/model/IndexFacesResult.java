/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

public class IndexFacesResult implements Serializable {
    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see <a>howitworks-index-faces</a>.
     * </p>
     */
    private java.util.List<FaceRecord> faceRecords;

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image
     * was rotated, it returns the degree of rotation. You can use this value to
     * correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     */
    private String orientationCorrection;

    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see <a>howitworks-index-faces</a>.
     * </p>
     *
     * @return <p>
     *         An array of faces detected and added to the collection. For more
     *         information, see <a>howitworks-index-faces</a>.
     *         </p>
     */
    public java.util.List<FaceRecord> getFaceRecords() {
        return faceRecords;
    }

    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see <a>howitworks-index-faces</a>.
     * </p>
     *
     * @param faceRecords <p>
     *            An array of faces detected and added to the collection. For
     *            more information, see <a>howitworks-index-faces</a>.
     *            </p>
     */
    public void setFaceRecords(java.util.Collection<FaceRecord> faceRecords) {
        if (faceRecords == null) {
            this.faceRecords = null;
            return;
        }

        this.faceRecords = new java.util.ArrayList<FaceRecord>(faceRecords);
    }

    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see <a>howitworks-index-faces</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceRecords <p>
     *            An array of faces detected and added to the collection. For
     *            more information, see <a>howitworks-index-faces</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesResult withFaceRecords(FaceRecord... faceRecords) {
        if (getFaceRecords() == null) {
            this.faceRecords = new java.util.ArrayList<FaceRecord>(faceRecords.length);
        }
        for (FaceRecord value : faceRecords) {
            this.faceRecords.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of faces detected and added to the collection. For more
     * information, see <a>howitworks-index-faces</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param faceRecords <p>
     *            An array of faces detected and added to the collection. For
     *            more information, see <a>howitworks-index-faces</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IndexFacesResult withFaceRecords(java.util.Collection<FaceRecord> faceRecords) {
        setFaceRecords(faceRecords);
        return this;
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image
     * was rotated, it returns the degree of rotation. You can use this value to
     * correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @return <p>
     *         The algorithm detects the image orientation. If it detects that
     *         the image was rotated, it returns the degree of rotation. You can
     *         use this value to correct the orientation and also appropriately
     *         analyze the bounding box coordinates that are returned.
     *         </p>
     * @see OrientationCorrection
     */
    public String getOrientationCorrection() {
        return orientationCorrection;
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image
     * was rotated, it returns the degree of rotation. You can use this value to
     * correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The algorithm detects the image orientation. If it detects
     *            that the image was rotated, it returns the degree of rotation.
     *            You can use this value to correct the orientation and also
     *            appropriately analyze the bounding box coordinates that are
     *            returned.
     *            </p>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image
     * was rotated, it returns the degree of rotation. You can use this value to
     * correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The algorithm detects the image orientation. If it detects
     *            that the image was rotated, it returns the degree of rotation.
     *            You can use this value to correct the orientation and also
     *            appropriately analyze the bounding box coordinates that are
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public IndexFacesResult withOrientationCorrection(String orientationCorrection) {
        this.orientationCorrection = orientationCorrection;
        return this;
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image
     * was rotated, it returns the degree of rotation. You can use this value to
     * correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The algorithm detects the image orientation. If it detects
     *            that the image was rotated, it returns the degree of rotation.
     *            You can use this value to correct the orientation and also
     *            appropriately analyze the bounding box coordinates that are
     *            returned.
     *            </p>
     * @see OrientationCorrection
     */
    public void setOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
    }

    /**
     * <p>
     * The algorithm detects the image orientation. If it detects that the image
     * was rotated, it returns the degree of rotation. You can use this value to
     * correct the orientation and also appropriately analyze the bounding box
     * coordinates that are returned.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ROTATE_0, ROTATE_90, ROTATE_180, ROTATE_270
     *
     * @param orientationCorrection <p>
     *            The algorithm detects the image orientation. If it detects
     *            that the image was rotated, it returns the degree of rotation.
     *            You can use this value to correct the orientation and also
     *            appropriately analyze the bounding box coordinates that are
     *            returned.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see OrientationCorrection
     */
    public IndexFacesResult withOrientationCorrection(OrientationCorrection orientationCorrection) {
        this.orientationCorrection = orientationCorrection.toString();
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
        if (getFaceRecords() != null)
            sb.append("FaceRecords: " + getFaceRecords() + ",");
        if (getOrientationCorrection() != null)
            sb.append("OrientationCorrection: " + getOrientationCorrection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFaceRecords() == null) ? 0 : getFaceRecords().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrientationCorrection() == null) ? 0 : getOrientationCorrection().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IndexFacesResult == false)
            return false;
        IndexFacesResult other = (IndexFacesResult) obj;

        if (other.getFaceRecords() == null ^ this.getFaceRecords() == null)
            return false;
        if (other.getFaceRecords() != null
                && other.getFaceRecords().equals(this.getFaceRecords()) == false)
            return false;
        if (other.getOrientationCorrection() == null ^ this.getOrientationCorrection() == null)
            return false;
        if (other.getOrientationCorrection() != null
                && other.getOrientationCorrection().equals(this.getOrientationCorrection()) == false)
            return false;
        return true;
    }
}
