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

package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Refreshes the cache for the specified file share. This operation finds
 * objects in the Amazon S3 bucket that were added, removed or replaced since
 * the gateway last listed the bucket's contents and cached the results. This
 * operation is only supported in the file gateway type. You can subscribe to be
 * notified through an Amazon CloudWatch event when your RefreshCache operation
 * completes. For more information, see <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
 * >Getting notified about file operations</a> in the <i>AWS Storage Gateway
 * User Guide</i>.
 * </p>
 * <p>
 * When this API is called, it only initiates the refresh operation. When the
 * API call completes and returns a success code, it doesn't necessarily mean
 * that the file refresh has completed. You should use the refresh-complete
 * notification to determine that the operation has completed before you check
 * for new files on the gateway file share. You can subscribe to be notified
 * through an CloudWatch event when your <code>RefreshCache</code> operation
 * completes.
 * </p>
 * <p>
 * Throttle limit: This API is asynchronous so the gateway will accept no more
 * than two refreshes at any time. We recommend using the refresh-complete
 * CloudWatch event notification before issuing additional requests. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
 * >Getting notified about file operations</a> in the <i>AWS Storage Gateway
 * User Guide</i>.
 * </p>
 * <p>
 * If you invoke the RefreshCache API when two requests are already being
 * processed, any new request will cause an
 * <code>InvalidGatewayRequestException</code> error because too many requests
 * were sent to the server.
 * </p>
 * <p>
 * For more information, see <a href=
 * "https://docs.aws.amazon.com/storagegateway/latest/userguide/monitoring-file-gateway.html#get-notification"
 * >Getting notified about file operations</a> in the <i>AWS Storage Gateway
 * User Guide</i>.
 * </p>
 */
public class RefreshCacheRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share you want to refresh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String fileShareARN;

    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache.
     * The default is [<code>"/"</code>]. The default refreshes objects and
     * folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is
     * set to <code>true</code>, the entire S3 bucket that the file share has
     * access to is refreshed.
     * </p>
     */
    private java.util.List<String> folderList;

    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the
     * cache. The refresh includes folders that were in the cache the last time
     * the gateway listed the folder's contents. If this value set to
     * <code>true</code>, each folder that is listed in <code>FolderList</code>
     * is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in
     * folders listed directly under <code>FolderList</code> are found and used
     * for the update. The default is <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean recursive;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share you want to refresh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the file share you want to
     *         refresh.
     *         </p>
     */
    public String getFileShareARN() {
        return fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share you want to refresh.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share you want to
     *            refresh.
     *            </p>
     */
    public void setFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the file share you want to refresh.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param fileShareARN <p>
     *            The Amazon Resource Name (ARN) of the file share you want to
     *            refresh.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshCacheRequest withFileShareARN(String fileShareARN) {
        this.fileShareARN = fileShareARN;
        return this;
    }

    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache.
     * The default is [<code>"/"</code>]. The default refreshes objects and
     * folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is
     * set to <code>true</code>, the entire S3 bucket that the file share has
     * access to is refreshed.
     * </p>
     *
     * @return <p>
     *         A comma-separated list of the paths of folders to refresh in the
     *         cache. The default is [<code>"/"</code>]. The default refreshes
     *         objects and folders at the root of the Amazon S3 bucket. If
     *         <code>Recursive</code> is set to <code>true</code>, the entire S3
     *         bucket that the file share has access to is refreshed.
     *         </p>
     */
    public java.util.List<String> getFolderList() {
        return folderList;
    }

    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache.
     * The default is [<code>"/"</code>]. The default refreshes objects and
     * folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is
     * set to <code>true</code>, the entire S3 bucket that the file share has
     * access to is refreshed.
     * </p>
     *
     * @param folderList <p>
     *            A comma-separated list of the paths of folders to refresh in
     *            the cache. The default is [<code>"/"</code>]. The default
     *            refreshes objects and folders at the root of the Amazon S3
     *            bucket. If <code>Recursive</code> is set to <code>true</code>,
     *            the entire S3 bucket that the file share has access to is
     *            refreshed.
     *            </p>
     */
    public void setFolderList(java.util.Collection<String> folderList) {
        if (folderList == null) {
            this.folderList = null;
            return;
        }

        this.folderList = new java.util.ArrayList<String>(folderList);
    }

    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache.
     * The default is [<code>"/"</code>]. The default refreshes objects and
     * folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is
     * set to <code>true</code>, the entire S3 bucket that the file share has
     * access to is refreshed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param folderList <p>
     *            A comma-separated list of the paths of folders to refresh in
     *            the cache. The default is [<code>"/"</code>]. The default
     *            refreshes objects and folders at the root of the Amazon S3
     *            bucket. If <code>Recursive</code> is set to <code>true</code>,
     *            the entire S3 bucket that the file share has access to is
     *            refreshed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshCacheRequest withFolderList(String... folderList) {
        if (getFolderList() == null) {
            this.folderList = new java.util.ArrayList<String>(folderList.length);
        }
        for (String value : folderList) {
            this.folderList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A comma-separated list of the paths of folders to refresh in the cache.
     * The default is [<code>"/"</code>]. The default refreshes objects and
     * folders at the root of the Amazon S3 bucket. If <code>Recursive</code> is
     * set to <code>true</code>, the entire S3 bucket that the file share has
     * access to is refreshed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param folderList <p>
     *            A comma-separated list of the paths of folders to refresh in
     *            the cache. The default is [<code>"/"</code>]. The default
     *            refreshes objects and folders at the root of the Amazon S3
     *            bucket. If <code>Recursive</code> is set to <code>true</code>,
     *            the entire S3 bucket that the file share has access to is
     *            refreshed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshCacheRequest withFolderList(java.util.Collection<String> folderList) {
        setFolderList(folderList);
        return this;
    }

    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the
     * cache. The refresh includes folders that were in the cache the last time
     * the gateway listed the folder's contents. If this value set to
     * <code>true</code>, each folder that is listed in <code>FolderList</code>
     * is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in
     * folders listed directly under <code>FolderList</code> are found and used
     * for the update. The default is <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that specifies whether to recursively refresh folders in
     *         the cache. The refresh includes folders that were in the cache
     *         the last time the gateway listed the folder's contents. If this
     *         value set to <code>true</code>, each folder that is listed in
     *         <code>FolderList</code> is recursively updated. Otherwise,
     *         subfolders listed in <code>FolderList</code> are not refreshed.
     *         Only objects that are in folders listed directly under
     *         <code>FolderList</code> are found and used for the update. The
     *         default is <code>true</code>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean isRecursive() {
        return recursive;
    }

    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the
     * cache. The refresh includes folders that were in the cache the last time
     * the gateway listed the folder's contents. If this value set to
     * <code>true</code>, each folder that is listed in <code>FolderList</code>
     * is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in
     * folders listed directly under <code>FolderList</code> are found and used
     * for the update. The default is <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @return <p>
     *         A value that specifies whether to recursively refresh folders in
     *         the cache. The refresh includes folders that were in the cache
     *         the last time the gateway listed the folder's contents. If this
     *         value set to <code>true</code>, each folder that is listed in
     *         <code>FolderList</code> is recursively updated. Otherwise,
     *         subfolders listed in <code>FolderList</code> are not refreshed.
     *         Only objects that are in folders listed directly under
     *         <code>FolderList</code> are found and used for the update. The
     *         default is <code>true</code>.
     *         </p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     *         </p>
     */
    public Boolean getRecursive() {
        return recursive;
    }

    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the
     * cache. The refresh includes folders that were in the cache the last time
     * the gateway listed the folder's contents. If this value set to
     * <code>true</code>, each folder that is listed in <code>FolderList</code>
     * is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in
     * folders listed directly under <code>FolderList</code> are found and used
     * for the update. The default is <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     *
     * @param recursive <p>
     *            A value that specifies whether to recursively refresh folders
     *            in the cache. The refresh includes folders that were in the
     *            cache the last time the gateway listed the folder's contents.
     *            If this value set to <code>true</code>, each folder that is
     *            listed in <code>FolderList</code> is recursively updated.
     *            Otherwise, subfolders listed in <code>FolderList</code> are
     *            not refreshed. Only objects that are in folders listed
     *            directly under <code>FolderList</code> are found and used for
     *            the update. The default is <code>true</code>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     */
    public void setRecursive(Boolean recursive) {
        this.recursive = recursive;
    }

    /**
     * <p>
     * A value that specifies whether to recursively refresh folders in the
     * cache. The refresh includes folders that were in the cache the last time
     * the gateway listed the folder's contents. If this value set to
     * <code>true</code>, each folder that is listed in <code>FolderList</code>
     * is recursively updated. Otherwise, subfolders listed in
     * <code>FolderList</code> are not refreshed. Only objects that are in
     * folders listed directly under <code>FolderList</code> are found and used
     * for the update. The default is <code>true</code>.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param recursive <p>
     *            A value that specifies whether to recursively refresh folders
     *            in the cache. The refresh includes folders that were in the
     *            cache the last time the gateway listed the folder's contents.
     *            If this value set to <code>true</code>, each folder that is
     *            listed in <code>FolderList</code> is recursively updated.
     *            Otherwise, subfolders listed in <code>FolderList</code> are
     *            not refreshed. Only objects that are in folders listed
     *            directly under <code>FolderList</code> are found and used for
     *            the update. The default is <code>true</code>.
     *            </p>
     *            <p>
     *            Valid Values: <code>true</code> | <code>false</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RefreshCacheRequest withRecursive(Boolean recursive) {
        this.recursive = recursive;
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
        if (getFileShareARN() != null)
            sb.append("FileShareARN: " + getFileShareARN() + ",");
        if (getFolderList() != null)
            sb.append("FolderList: " + getFolderList() + ",");
        if (getRecursive() != null)
            sb.append("Recursive: " + getRecursive());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFileShareARN() == null) ? 0 : getFileShareARN().hashCode());
        hashCode = prime * hashCode + ((getFolderList() == null) ? 0 : getFolderList().hashCode());
        hashCode = prime * hashCode + ((getRecursive() == null) ? 0 : getRecursive().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RefreshCacheRequest == false)
            return false;
        RefreshCacheRequest other = (RefreshCacheRequest) obj;

        if (other.getFileShareARN() == null ^ this.getFileShareARN() == null)
            return false;
        if (other.getFileShareARN() != null
                && other.getFileShareARN().equals(this.getFileShareARN()) == false)
            return false;
        if (other.getFolderList() == null ^ this.getFolderList() == null)
            return false;
        if (other.getFolderList() != null
                && other.getFolderList().equals(this.getFolderList()) == false)
            return false;
        if (other.getRecursive() == null ^ this.getRecursive() == null)
            return false;
        if (other.getRecursive() != null
                && other.getRecursive().equals(this.getRecursive()) == false)
            return false;
        return true;
    }
}
