/**
 * Copyright 2017-2018 Amazon.com,
 * Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Amazon Software License (the "License").
 * You may not use this file except in compliance with the
 * License. A copy of the License is located at
 *
 *     http://aws.amazon.com/asl/
 *
 * or in the "license" file accompanying this file. This file is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, express or implied. See the License
 * for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.kinesisvideo.internal.producer.jni;

import com.amazonaws.kinesisvideo.common.logging.Log;
import com.amazonaws.kinesisvideo.common.preconditions.Preconditions;

import androidx.annotation.NonNull;

/**
 * Static helper for loading libraries
 */
class NativeLibraryLoader {

    private final Log mLog;

    public NativeLibraryLoader(final @NonNull Log log) {
        mLog = Preconditions.checkNotNull(log);
    }

    /**
     * Attempts to load the native library by trying a library file first and if it fails then trying the library name
     *
     * @param fullPath    Full path to the library file (with or without the extension) - Optional
     * @param libraryName Library name - Optional
     * @return Whether the library was loaded OK
     */
    public boolean loadNativeLibrary(final String fullPath, final String libraryName) {
        // Both full path and library name can't be empty or null at the same time
        Preconditions.checkState(!((fullPath == null || fullPath.isEmpty()) && (libraryName == null || libraryName.isEmpty())),
                "Both the full path and library name can't be null at the same time");
        // Create the full names for different platforms
        final String soLibraryFileName = "lib" + libraryName + ".so";
        final String dylibLibraryFileName = "lib" + libraryName + ".dylib";
        final String dllLibraryFileName = "lib" + libraryName + ".dll";

        return loadNativeLibraryDirect(fullPath) ||
                loadNativeLibraryDirect(fullPath + ".so") ||
                loadNativeLibraryDirect(fullPath + ".dylib") ||
                loadNativeLibraryDirect(fullPath + ".dll") ||
                loadNativeLibraryDirect(soLibraryFileName) ||
                loadNativeLibraryDirect(dylibLibraryFileName) ||
                loadNativeLibraryDirect(dllLibraryFileName) ||
                loadNativeLibraryIndirect(libraryName);
    }

    /**
     * Attempts to load the native library directly given the path.
     *
     * @param libraryFullPath Full path to the library
     */
    private boolean loadNativeLibraryDirect(final @NonNull String libraryFullPath) {
        if (libraryFullPath != null && !libraryFullPath.isEmpty()) {
            try {
                System.load(libraryFullPath);
                mLog.verbose("Success! Directly loaded native library %s.", libraryFullPath);
                return true;
            } catch (final UnsatisfiedLinkError e) {
                mLog.warn("Unsatisfied link error. Directly loading native library %s.", libraryFullPath);
            } catch (final SecurityException e) {
                mLog.warn("Security exception. Directly loading native library %s.", libraryFullPath);
            }
        }

        // This is the error return case.
        return false;
    }

    /**
     * Attempting to load the library by it's name
     *
     * @param libraryName Library name
     */
    private boolean loadNativeLibraryIndirect(final @NonNull String libraryName) {
        try {
            System.loadLibrary(libraryName);
            mLog.verbose("Success! Indirectly loaded native library %s.", libraryName);
            return true;
        } catch (final UnsatisfiedLinkError e) {
            mLog.exception(e, "Unsatisfied link error. Loading native library %s failed with %s", libraryName, e.toString());
        } catch (final SecurityException e) {
            mLog.exception(e, "Security exception. Loading native library %s failed with %s", libraryName, e.toString());
        }

        // This is the error return case.
        return false;
    }
}
