/*
 * Copyright 2019-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.amazonaws.services.textract.model.AnalyzeDocumentRequest;
import com.amazonaws.services.textract.model.AnalyzeDocumentResult;
import com.amazonaws.services.textract.model.Block;
import com.amazonaws.services.textract.model.Document;
import com.amazonaws.services.textract.model.S3Object;
import com.amazonaws.testutils.AWSTestBase;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class AmazonTextractIntegrationTest extends AWSTestBase {

    private AmazonTextractClient textractClient;

    /** Package name in testconfiguration.json */
    protected static final String PACKAGE_NAME = InstrumentationRegistry.getTargetContext().
            getResources().getString(R.string.package_name);

    public static JSONObject getPackageConfigure() {
        return getPackageConfigure(PACKAGE_NAME);
    }

    @Before
    public void setUp() {
        setUpCredentials();
        textractClient = new AmazonTextractClient(credentials);
    }

    @Test
    public void testAnalyzeDocumentInS3() throws JSONException {
        AnalyzeDocumentRequest request = new AnalyzeDocumentRequest()
                .withFeatureTypes("TABLES", "FORMS")
                .withDocument(new Document().withS3Object(new S3Object()
                                        .withName(getPackageConfigure().getString("s3_key_name"))
                                        .withBucket(getPackageConfigure().getString("s3_bucket_name"))));

        AnalyzeDocumentResult result = textractClient.analyzeDocument(request);
        assertEquals(new Integer(1), result.getDocumentMetadata().getPages());

        List<Block> blocks = result.getBlocks();
        assert blocks.size() > 0;
    }
}
