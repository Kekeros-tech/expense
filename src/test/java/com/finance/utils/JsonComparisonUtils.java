package com.finance.utils;

import org.json.JSONException;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import java.text.MessageFormat;

public class JsonComparisonUtils {
    private static String readJson(String path) {
        return TestUtils.readResourceFile(MessageFormat.format("json/{0}", path));
    }

    private static void assertEqualJsonString(String expected, String actual) {
        try {
            JSONAssert.assertEquals(expected, actual, JSONCompareMode.LENIENT);
        } catch (JSONException e) {
            throw new RuntimeException("Failed to compare JSON", e);
        }
    }

    public static void assertEqual(String expected, String path) {
        assertEqualJsonString(expected, readJson(path));
    }
}
