# Pydio SDK for Java

## Getting started

The Pydio Java SDK provides a Java implementation to communicate with a Pydio Cells server (and also with the legacy Pydio 8+ versions). Most of the functions are wrapped into the `com.pydio.sdk.core.Client` class that contains methods to easily manage your files on a Pydio server.

## Configure and resolve a Pydio server

Given an URL, we create a ServerNode object to load the server info

```java
String url = "https://demo.pydio.com";
ServerNode node = new ServerNode();
Error error = node.resolve();
if (error != null) {
    // error.code could be one of:
    // Code.ssl_error
    // Code.pydio_server_not_supported
    // Code.con_failed
    // Code.ssl_certificate_not_signed
    System.out.println("failed to resolve server");
    return;
}

System.out.println("version: " + server.getVersion());
System.out.println("version name: " + server.getVersionName());
```

## Working with the Pydio client

### Instantiate a Pydio Client

To create a client pass the resolved server to the client factory

```java
Client client = Client.get(node);
```

### Setting user credentials

```java
Credentials credentials = new DefaultCredentials("login", "password");
client.setCredentials(credentials);
```

### Performing folder list

```java
// Listing the root of the "My Files" workspace
try {
    client.ls("my-files", "/", (n) -> {
        System.out.println(n.label());
    });
} catch(SDKexception e) {
    e.printStackTrace();
    Error error = Error.fromException(e)
    // error.code could be one of:
    // Code.ssl_error or
    // Code.pydio_server_not_supported
    // Code.con_failed
    // Code.ssl_certificate_not_signed
}
```

## Examples

Find more examples in [our sample package](./tree/master/src/main/java/com/pydio/sdk/examples).
