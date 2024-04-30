package com.sismics.docs.core.util;

import com.sismics.docs.core.model.jpa.Document;
import org.junit.Assert;
import org.junit.Test;

public class TestDocumentUtil {
    @Test
    public void createDocumentTest() {
        Document doc = new Document();
        doc.setUserId("test");
        DocumentUtil.createDocument(doc, "test");
        Assert.assertNotNull(doc.getId());
    }
}
