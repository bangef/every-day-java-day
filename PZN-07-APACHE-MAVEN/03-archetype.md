# Archetype

- Maven mendukung pembuatan berbagai macam project dengan mudah

- Pembuatan project di maven menggunakan `archetype`, archetype adalah template project.

- Kita bisa menggunakan yang sudah disediakan oleh maven, atau bisa membuat template archetype sendiri.

- [Apache Maven Archetypes &#x2013; Maven Archetypes](https://maven.apache.org/archetypes/index.html)

## Membuat Java Project

```shell
mvn archetype:generate
maven-archetype-quickstart
```

## GroupId

- Biasanya `GroupId` adalah nama perusahaan/company-nya.

```shell
bangef
```

## ArtifactId

- Biasnaya `ArtifactId` adalah nama projectnya.

```shell
belajar-apache-maven
```

## Version

- Adalah versi dari project, default versinya adalah `1.0-SNAPSHOT`

```shell
# ENTER SAJA KARENA MENGGUNAKAN DEFAULTNYA
```

## Package

- Adalah package dari projectnya.

```shell
# contoh:
com.bangef.maven 
```
