/*
+++++++++++++++++++++++++++++++++++++++++++
title     Northem Enumeration JUnit Test  +
project   northem-java                    +
file      NorthemTest.java                +
version                                   +
author    Arctic Ice Studio               +
email     development@arcticicestudio.com +
website   http://arcticicestudio.com      +
copyright Copyright (C) 2016              +
created   2016-01-23 10:24 UTC+0100       +
modified  2016-04-09 12:04 UTC+0200       +
+++++++++++++++++++++++++++++++++++++++++++

[Description]
JUnit test class for the 'Northem' class of the "Northem - Java" API.

[Copyright]
Copyright (C) 2016 Arctic Ice Studio <development@arcticicestudio.com>

[References]
Northem
  (https://github.com/arcticicestudio/northem)
Java 8 API Documentation
  (https://docs.oracle.com/javase/8/docs/api/)
JavaFX 2.2 API Documentation
  (https://docs.oracle.com/javafx/2/api/)
JavaFX 2.2 Oracle Project Website
  (http://docs.oracle.com/javase/8/javase-clienttechnologies.htm)
Arctic Versioning Specification
  (http://specs.arcticicestudio.com/arcver) (ArcVer)
*/

package com.arcticicestudio.northem;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * JUnit test class for the {@link Northem} class of the
 * <a href="https://github.com/arcticicestudio/northem-java">Northem - Java</a> API.
 *
 * @author Arctic Ice Studio &lt;development@arcticicestudio.com&gt;
 * @see Northem
 * @see <a href="http://junit.org/">http://junit.org/</a>
 * @see <a href="https://github.com/arcticicestudio/northem-java">Northem - Java</a>
 * @since 0.1.0
 */
public class NorthemTest {
  @Test
  public void shouldReturnTheCorrectHEXColorCode() {
    assertEquals(Northem.hex(Northem.DARKEST_GRAY.get()), "#2D2D2E");
    assertEquals(Northem.hex(Northem.DARK_GRAY.get()), "#333334");
    assertEquals(Northem.hex(Northem.GRAY.get()), "#383839");
    assertEquals(Northem.hex(Northem.LIGHT_GRAY.get()), "#606062");
    assertEquals(Northem.hex(Northem.DIRTY_WHITE.get()), "#DEDEDE");
    assertEquals(Northem.hex(Northem.WHITE.get()), "#ECEEEF");
    assertEquals(Northem.hex(Northem.AQUA.get()), "#90CDC7");
    assertEquals(Northem.hex(Northem.LIGHT_BLUE.get()), "#86C1D2");
    assertEquals(Northem.hex(Northem.BLUE.get()), "#88B2CD");
    assertEquals(Northem.hex(Northem.DARK_BLUE.get()), "#5C81AE");
    assertEquals(Northem.hex(Northem.RED.get()), "#DF7574");
    assertEquals(Northem.hex(Northem.YELLOW.get()), "#FCCE85");
    assertEquals(Northem.hex(Northem.ORANGE.get()), "#EFA070");
    assertEquals(Northem.hex(Northem.LIME.get()), "#C8CB79");
    assertEquals(Northem.hex(Northem.PURPLE.get()), "#C2A2C9");
  }
}
