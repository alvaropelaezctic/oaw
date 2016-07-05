package es.inteco.rastreador2.pdf.utils;

import junit.framework.Assert;
import org.junit.Test;

/**
 *
 */
public class PDFUtilsTest {

    @Test
    public void testFormatSeedName() {
        Assert.assertNull(PDFUtils.formatSeedName(null));
        Assert.assertEquals("",PDFUtils.formatSeedName(""));
        Assert.assertEquals("prueba",PDFUtils.formatSeedName("PrUeBa"));
        Assert.assertEquals("prueba",PDFUtils.formatSeedName("PrUeBa  "));
        Assert.assertEquals("prueba",PDFUtils.formatSeedName(" PrUeBa  "));
        Assert.assertEquals("prueba_espacio",PDFUtils.formatSeedName("PrUeBa esPaCio"));
        Assert.assertEquals("prueba_espacio",PDFUtils.formatSeedName("PrUeBa, esPaCio"));
        Assert.assertEquals("prueba_espacio_",PDFUtils.formatSeedName("PrUeBa, esPaCio."));
        Assert.assertEquals("prueba-guion",PDFUtils.formatSeedName("PrUeBa-Guión"));
    }

}