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

package com.amazonaws.testutils;

import static junit.framework.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.amazonaws.AmazonClientException;
import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSCredentialsProviderChain;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.util.StringUtils;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Scanner;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.RawRes;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

@RunWith(AndroidJUnit4.class)
public abstract class AWSTestBase {

    protected static final String TEST_CONFIGURATION_FILENAME = "testconfiguration.json";

    public static class JSONConfiguration  {
        private JSONObject mJSONObject ;
        public JSONConfiguration(JSONObject mJSONObject) {
            this.mJSONObject = mJSONObject ;
        }
        JSONObject getCredentials() {
            try {
                return mJSONObject.getJSONObject("Credentials");
            }
            catch (JSONException je) {
                throw new RuntimeException(
                        "Failed to get credentials from " + TEST_CONFIGURATION_FILENAME + ", please check that it is correctly formed.",
                        je);
            }
        }
        JSONObject getPackages()  {
            try {
                return mJSONObject.getJSONObject("Packages");
            }
            catch (JSONException je) {
                throw new RuntimeException(
                        "Failed to get Packages from " + TEST_CONFIGURATION_FILENAME + ", please check that it is correctly formed.",
                        je);
            }
         }
        public JSONObject getPackageConfigure(String packageName) {
            try {
                return getPackages().getJSONObject(packageName);
            }
            catch (JSONException je) {
                throw new RuntimeException(
                        "Failed to get package configuration from " + TEST_CONFIGURATION_FILENAME + " + packageName",
                        je);
            }
        }

        public String getAccessKey() {
            try {
                return getCredentials().getString("accessKey");
            }
            catch (JSONException je) {
                throw new RuntimeException(
                        "Failed to get accessKey from " + TEST_CONFIGURATION_FILENAME + ", please check that it is correctly formed.",
                        je);
            }
        }
        public String getSecretKey() {
            try {
                return getCredentials().getString("secretKey");
            }
            catch (JSONException je) {
                throw new RuntimeException(
                        "Failed to get secretKey from " + TEST_CONFIGURATION_FILENAME + ", please check that it is correctly formed.",
                        je);
            }
        }  
        public String getAccountId() {
            try {
                return getCredentials().getString("accountId");
            }
            catch (JSONException je) {
                throw new RuntimeException(
                        "Failed to get accountId from " + TEST_CONFIGURATION_FILENAME + ", please check that it is correctly formed.",
                        je);
            }
        }
    }

    /**
     * An implementation of AWSCredentialProvider that fetches the credentials
     * from test configuration json file.
     */
    static class JSONCredentialProvider implements AWSCredentialsProvider {

        @Override
        public AWSCredentials getCredentials()  {
            String accessKey = "";
            String secretAccessKey = "";

            try {
                accessKey =  getAccessKey();
                secretAccessKey = getSecretKey();
            } catch (Exception e) {
                Log.e(TAG, "Failed to get credentials");
                e.printStackTrace();
            }
            return new BasicAWSCredentials(accessKey , secretAccessKey );
        }

        @Override
        public void refresh() {
            getCredentials();
        }

    }

    public static final String TAG = AWSTestBase.class.getSimpleName();
    /** Shared AWS credentials, loaded from a properties file */
    public static AWSCredentials credentials;
    private static JSONConfiguration mJSONConfiguration; 
    


    public static JSONConfiguration getJSONConfiguration()
    {
        Context context = getContext() ;
        if (mJSONConfiguration == null) {
            try {
                Resources resources = context.getResources();
                String packageName = context.getPackageName();
                @RawRes int resourceId =
                    resources.getIdentifier(TEST_CONFIGURATION_FILENAME, "raw", packageName);
                InputStream inputStream = resources.openRawResource(resourceId);
                Scanner in = new Scanner(inputStream);
                StringBuilder sb = new StringBuilder();
                while (in.hasNextLine()) {
                    sb.append(in.nextLine());
                }
                in.close();

                mJSONConfiguration  = new JSONConfiguration(new JSONObject(sb.toString()));
            } catch (Exception je) {
                throw new RuntimeException(
                        "Failed to read " + TEST_CONFIGURATION_FILENAME + " please check that it is correctly formed.",
                        je);
            }
        }
        return mJSONConfiguration;
    }
    public static String getAccessKey() {
        return getJSONConfiguration().getAccessKey();
    }
    public static String  getSecretKey() {
        return getJSONConfiguration().getSecretKey();
    }
    public static String getAccountId() {
        return getJSONConfiguration().getAccountId();
    }
    public static JSONObject  getPackageConfigure(String packageName) {
        return getJSONConfiguration().getPackageConfigure(packageName);
    }

    private  static Context getContext() {

        return InstrumentationRegistry.getContext();
    }
 
    private  static JSONCredentialProvider getJSONCredentialProvider() {
        try
        {
            JSONCredentialProvider provider = new JSONCredentialProvider();
            return provider ;
        }
        catch (Exception e) {

            throw e;

        }
    }

    /**
     * Use provider chain for getting credentials.
     */
    private static final AWSCredentialsProviderChain chain = new AWSCredentialsProviderChain(
            getJSONCredentialProvider()
    );

    public static void setUpCredentials() {
        if (credentials == null) {
            credentials = chain.getCredentials();
        }
    }

    /**
     * Asserts that the specified String is not null and not empty.
     *
     * @param s The String to test.
     */
    protected void assertNotEmpty(String s) {
        assertNotNull(s);
        assertTrue(s.length() > 0);
    }

    /**
     * Asserts that the contents in the specified file are exactly equal to the
     * contents read from the specified input stream. The input stream will be
     * closed at the end of this method. If any problems are encountered, or the
     * stream's contents don't match up exactly with the file's contents, then
     * this method will fail the current test.
     *
     * @param expectedFile The file containing the expected contents.
     * @param inputStream The stream that will be read, compared to the expected
     *            file contents, and finally closed.
     */
    protected void assertFileEqualsStream(File expectedFile, InputStream inputStream) {
        try {
            InputStream expectedInputStream = new FileInputStream(expectedFile);
            assertStreamEqualsStream(expectedInputStream, inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            fail("Expected file doesn't exist: " + e.getMessage());
        }
    }

    protected void assertStreamEqualsStream(InputStream expectedInputStream, InputStream inputStream) {
        try {
            assertTrue(doesStreamEqualStream(expectedInputStream, inputStream));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Error reading from stream: " + e.getMessage());
        }
    }

    protected void assertFileEqualsFile(File expectedFile, File file) {
        if (expectedFile.exists() == false)
            fail("Expected file doesn't exist");
        if (file.exists() == false)
            fail("Testing file doesn't exist");

        Assert.assertEquals(expectedFile.length(), file.length());

        try {
            FileInputStream expectedInputStream = new FileInputStream(expectedFile);
            FileInputStream testedInputStream = new FileInputStream(file);

            assertStreamEqualsStream(expectedInputStream, testedInputStream);
        } catch (Exception e) {
            e.printStackTrace();
            fail("Unable to compare files: " + e.getMessage());
        }
    }

    /**
     * Asserts that the contents in the specified string are exactly equal to
     * the contents read from the specified input stream. The input stream will
     * be closed at the end of this method. If any problems are encountered, or
     * the stream's contents don't match up exactly with the string's contents,
     * then this method will fail the current test.
     *
     * @param expectedString The string containing the expected data.
     * @param inputStream The stream that will be read, compared to the expected
     *            string data, and finally closed.
     */
    protected void assertStringEqualsStream(String expectedString, InputStream inputStream) {
        try {
            InputStream expectedInputStream = new ByteArrayInputStream(
                    expectedString.getBytes(StringUtils.UTF8));
            assertTrue(doesStreamEqualStream(expectedInputStream, inputStream));
        } catch (IOException e) {
            e.printStackTrace();
            fail("Error reading from stream: " + e.getMessage());
        }
    }

    /**
     * Returns true if, and only if, the contents read from the specified input
     * streams are exactly equal. Both input streams will be closed at the end
     * of this method.
     *
     * @param expectedInputStream The input stream containing the expected
     *            contents.
     * @return True if the two input streams contain the same data.
     * @throws IOException If any problems are encountered comparing the file
     *             and stream.
     */
    protected boolean doesStreamEqualStream(InputStream expectedInputStream,
            InputStream actualInputStream) throws IOException {
        byte[] expectedDigest = null;
        byte[] actualDigest = null;

        try {
            expectedDigest = calculateMD5Digest(expectedInputStream);
            actualDigest = calculateMD5Digest(actualInputStream);

            return Arrays.equals(expectedDigest, actualDigest);
        } catch (NoSuchAlgorithmException nse) {
            throw new AmazonClientException(nse.getMessage(), nse);
        } finally {
            try {
                expectedInputStream.close();
            } catch (Exception e) {
            }
            try {
                actualInputStream.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Calculates the MD5 digest for the given input stream and returns it.
     */
    private byte[] calculateMD5Digest(InputStream is) throws NoSuchAlgorithmException, IOException {
        int bytesRead = 0;
        byte[] buffer = new byte[2048];
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        while ((bytesRead = is.read(buffer)) != -1) {
            md5.update(buffer, 0, bytesRead);
        }
        return md5.digest();
    }

    protected byte[] drainInputStream(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        try {
            byte[] buffer = new byte[1024];
            long bytesRead = 0;
            while ((bytesRead = inputStream.read(buffer)) > -1) {
                byteArrayOutputStream.write(buffer, 0, (int) bytesRead);
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (Exception e) {
            }
        }
    }

    /**
     * Returns true if, and only if, the contents in the specified file are
     * exactly equal to the contents read from the specified input stream. The
     * input stream will be closed at the end of this method.
     *
     * @param expectedFile The file containing the expected contents.
     * @param inputStream The stream that will be read, compared to the expected
     *            file contents, and finally closed.
     * @throws IOException If any problems are encountered comparing the file
     *             and stream.
     */
    protected boolean doesFileEqualStream(File expectedFile, InputStream inputStream)
            throws IOException {
        InputStream expectedInputStream = new FileInputStream(expectedFile);
        return doesStreamEqualStream(expectedInputStream, inputStream);
    }

    /**
     * Asserts that the specified AmazonServiceException is valid, meaning it
     * has a non-empty, non-null value for its message, requestId, etc.
     *
     * @param e The exception to validate.
     */
    protected void assertValidException(AmazonServiceException e) {
        assertNotNull(e.getRequestId());
        assertTrue(e.getRequestId().trim().length() > 0);

        assertNotNull(e.getMessage());
        assertTrue(e.getMessage().trim().length() > 0);

        assertNotNull(e.getErrorCode());
        assertTrue(e.getErrorCode().trim().length() > 0);

        assertNotNull(e.getServiceName());
        assertTrue(e.getServiceName().startsWith("Amazon"));
    }

    protected void deleteAllEncryptionKeys() {
        Context appContext = InstrumentationRegistry.getTargetContext();
        appContext.getSharedPreferences("com.amazonaws.android.auth.encryptionkey",
                Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();
        appContext.getSharedPreferences("CognitoIdentityProviderCache.encryptionkey",
                Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();
        appContext.getSharedPreferences("com.amazonaws.mobile.client.encryptionkey",
                Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN_MR2) {
            try {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);

                Enumeration<String> keyAliases = keyStore.aliases();
                while (keyAliases.hasMoreElements()) {
                    final String keyAlias = keyAliases.nextElement();
                    junit.framework.Assert.assertTrue(keyStore.containsAlias(keyAlias));
                    keyStore.deleteEntry(keyAlias);
                    assertFalse(keyStore.containsAlias(keyAlias));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                fail("Error in deleting encryption keys from the Android KeyStore.");
            }
        }
    }
}
