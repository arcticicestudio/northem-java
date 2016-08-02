Northem - Java
==============

## 0.2.0 (2016-08-02) - Apache Maven Migration
This version is mainly focused on a [Apache Maven](https://maven.apache.org) migration.
Release and snapshot versions are now deployed to the [Central Repository](https://search.maven.org) via [OSS Sonatype](https://oss.sonatype.org).

### Improvements
#### Build Tool
  - Migrated to [Apache Maven](https://maven.apache.org) based on the [`glacier-apache-maven@0.3.0`](https://github.com/arcticicestudio/glacier-apache-maven) project skeletons

#### Documentation
  - The `README` has been restyled and now includes a "Getting started" section

## 0.1.0 (2016-04-09)
### Features
  - Implemented the [Northem](https://github.com/arcticicestudio/northem) color palette enumeration class [`Northem`](https://github.com/arcticicestudio/northem-java/blob/master/src/main/java/com/arcticicestudio/northem/Northem.java)  

**Constants**

| Name           | RGB Value     |
| -------------- | ------------- |
| `DARKEST_GRAY` | `45,45,46`    |
| `DARK_GRAY`    | `51,51,52`    |
| `GRAY`         | `56,56,57`    |
| `LIGHT_GRAY`   | `96,96,98`    |
| `DIRTY_WHITE`  | `222,222,222` |
| `WHITE`        | `236,238,239` |
| `AQUA`         | `144,205,199` |
| `LIGHT_BLUE`   | `134,193,210` |
| `BLUE`         | `136,178,205` |
| `DARK_BLUE`    | `92,129,174`  |
| `RED`          | `223,117,116` |
| `YELLOW`       | `252,206,133` |
| `ORANGE`       | `239,160,112` |
| `LIME`         | `200,203,121` |
| `PURPLE`       | `194,162,201` |

**Methods**

| Name | Description |
| ---- | ----------- |
| `Northem(final int RED, final int GREEN, final int BLUE)` | Constructs a new color object. |
| `public static String rgb(final Color COLOR)` | Converts the color to the RGB identifier. |
| `public static String hex(final Color COLOR)` | Converts the color to the HEX identifier. |
| `public Color get()` | Returns the color object. |

## 0.0.0 (2016-04-09) - Repository Reinitialization
