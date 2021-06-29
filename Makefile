.PHONY: proto-compile
proto-compile:
	protoc -I/usr/local/lib/protobuf/include --java_out=src/main/java /usr/local/lib/protobuf/include/hedwig/protobuf/container.proto
	protoc -I/usr/local/lib/protobuf/include --java_out=src/main/java /usr/local/lib/protobuf/include/hedwig/protobuf/options.proto
