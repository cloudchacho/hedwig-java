# Hedwig Java

Compiled protobuf files for github.com/cloudchacho/hedwig.

## Usage

- Add maven dependency:
    ```xml
            <dependency>
                <groupId>io.github.cloudchacho</groupId>
                <artifactId>hedwig</artifactId>
                <version>0.1</version>
            </dependency>
    ```
- Install protoc: https://github.com/protocolbuffers/protobuf
- Install Hedwig proto files:
```shell
git clone https://github.com/cloudchacho/hedwig.git /usr/local/lib/protobuf/include/hedwig
```

any path is fine, just make sure to provide it to `protoc -I`.
